package net.entrofi.workouttracker.service;

import net.entrofi.workouttracker.domain.model.User;
import net.entrofi.workouttracker.domain.repository.UserRepository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;


@Named("userService")
public class UserServiceImpl implements UserService {


    @Inject
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public void delete(String id) {
        userRepository.delete(id);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public User find(String id) {
        return userRepository.findById(id);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
