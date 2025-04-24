package com.sridhar.infinitystream.controller;

import com.sridhar.infinitystream.model.User;
import com.sridhar.infinitystream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public AuthController(UserService userService, BCryptPasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        // Encrypt the password before saving
        String encryptedPassword = passwordEncoder.encode(user.getUserPassword());
        user.setUserPassword(encryptedPassword);

        // Save the user to the database
        User savedUser = userService.saveUser(user);

        // Return the saved user with HTTP status OK
        return ResponseEntity.ok(savedUser);
    }

    @GetMapping("/register")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
