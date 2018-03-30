package net.entrofi.workouttracker.service;


import net.entrofi.workouttracker.domain.model.User;

import java.util.List;

public interface UserService {


    User save(User user);

    User signUp(User user);

    void delete(User user);

    void delete(String id);

    User find(String id);

    User findByUsername(String username);

    User findByEmail(String email);

    List<User> findAll();

}
