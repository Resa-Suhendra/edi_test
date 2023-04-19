package com.resa.testedi.service;

import com.resa.testedi.entity.User;
import com.resa.testedi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Resa S.
 * Date: 19-04-2023
 * Created in IntelliJ IDEA.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // getAllUsers
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // getUserById
    public User getUserById(long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    // createUser
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // updateUser
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    // deleteUser
    public long deleteUser(long userId) {
        userRepository.deleteById(userId);
        return userId;
    }
}
