package net.entrofi.workouttracker.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public final class LoginHelper {


    public static final String ANONYMOUS_USER = "anonymousUser";

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginHelper.class);

    private LoginHelper() { }


    public static Optional<UserDetails> getCurrentUserDetails() {
        Optional<UserDetails> userDetailsOp = Optional.ofNullable(null);
        try {
            final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            final Optional<Authentication> authOptional = Optional.ofNullable(authentication);
            userDetailsOp = authOptional.filter(LoginHelper::isValidAuthentication)
                    .map(a -> (UserDetails) a.getPrincipal());
        } catch (Exception e) {
            LOGGER.warn("Error getting current user details", e);
        }
        return userDetailsOp;
    }

    private static boolean isValidAuthentication(final Authentication authentication) {
        return authentication == null
                || !authentication.isAuthenticated()
                ||  ANONYMOUS_USER.equals(authentication.getName());
    }
}
