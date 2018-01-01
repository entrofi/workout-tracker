package net.entrofi.workouttracker.api.controller;


import net.entrofi.workouttracker.api.LoginHelper;
import net.entrofi.workouttracker.api.model.Credentials;
import net.entrofi.workouttracker.api.model.CurrentUserInfo;
import net.entrofi.workouttracker.domain.model.User;
import net.entrofi.workouttracker.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityLinks;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("/login")
public final class LoginController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserService userService;

    @Autowired
    private EntityLinks entityLinks;


    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public HttpEntity<CurrentUserInfo> getStatus() {
        String userId = getCurrentUserInfo().getUserId();
        CurrentUserInfo currentUserInfo = getCurrentUserInfo();
        currentUserInfo.add(entityLinks
                        .linkForSingleResource(User.class, userId).withSelfRel());
        return new ResponseEntity<CurrentUserInfo>(currentUserInfo, HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.POST)
    public HttpEntity<CurrentUserInfo> login(@RequestBody Credentials credentials) {

        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
                credentials.getUsername(),
                credentials.getPassword());

        LOGGER.info("Trying to authenticate user: {}", credentials.getUsername());
        try {
            Authentication auth = authenticationManager.authenticate(token);
            SecurityContextHolder.getContext().setAuthentication(auth);
        } catch (BadCredentialsException e) {
            LOGGER.warn("Unable to authenticate user: {}", credentials.getUsername());
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }

        return getStatus();
    }

    private CurrentUserInfo getCurrentUserInfo() {
        Optional<UserDetails> userDetailsOp = LoginHelper.getCurrentUserDetails();
        Optional<User> userOp = userDetailsOp.map(userDetails -> userService.findByUsername(userDetails.getUsername()));

        return userOp.filter(u -> u != null)
                .map(user -> new CurrentUserInfo(user))
                .orElseGet(CurrentUserInfo::new);
    }


}
