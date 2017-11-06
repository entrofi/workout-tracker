package net.entrofi.workouttracker.controller;

import net.entrofi.workouttracker.domain.model.User;
import net.entrofi.workouttracker.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by comakh on 29/09/2015.
 */
@RestController
@RequestMapping(value = "/v1/users")
public class UserController {


    @Inject
    private UserService userService;


    @RequestMapping(method = RequestMethod.POST)
    public User save(@RequestBody User user) {
        userService.save(user);
        return user;
    }


    @RequestMapping(value = "find", method = RequestMethod.GET)
    public User find(String id) {
        return userService.find(id);
    }


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> delete(@PathVariable String id) {
        userService.delete(id);
        return ResponseEntity.ok(id);
    }


    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<String> delete(@RequestBody User user) {
        User userToDelete = userService.find(user.getId());
        if (userToDelete == null) {
            return ResponseEntity.ok("Provided user does not exist in database");
        } else {
            String id = userToDelete.getId();
            userService.delete(userToDelete);
            return ResponseEntity.ok(id);
        }
    }
}
