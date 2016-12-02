package net.entrofi.workouttracker.service;


import net.entrofi.workouttracker.domain.model.User;

import java.util.List;

public interface UserService {


    User save(User user);

    User update(User user);

    void delete(User user);

    void delete(String id);

    User find(String id);

    List<User> findAll();

}
