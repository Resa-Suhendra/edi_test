package com.resa.testedi.controller;

import com.resa.testedi.entity.User;
import com.resa.testedi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Resa S.
 * Date: 19-04-2023
 * Created in IntelliJ IDEA.
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // getAllUsers
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // getUserById
    @GetMapping("/{userId}")
    ResponseEntity getUserById(@PathVariable(value = "userId") long userId) {
        if (userService.getUserById(userId) == null) {
            return ResponseEntity.notFound().build();
        }
        User user = userService.getUserById(userId);
        return ResponseEntity.ok().body(user);
    }

    // createUser
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    // updateUser
    @PutMapping
    public ResponseEntity updateUser(@RequestBody User user) {
        User temp = userService.getUserById(user.getUserId());
        if (temp == null) {
            return ResponseEntity.notFound().build();
        }
        userService.updateUser(user);
        return ResponseEntity.ok().body(user);
    }

    // deleteUser
    @DeleteMapping("/{userId}")
    public ResponseEntity deleteUser(@PathVariable(value = "userId") long userId) {
        User user = userService.getUserById(userId);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        userService.deleteUser(userId);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok().body(response);
    }
}
