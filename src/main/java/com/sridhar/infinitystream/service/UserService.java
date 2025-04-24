package com.sridhar.infinitystream.service;

import com.sridhar.infinitystream.model.User;
import com.sridhar.infinitystream.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder(); // create BCrypt manually
    }

    public User saveUser(User user) {
        // No need to encrypt password here as it's already encrypted in the controller
        return userRepository.save(user);  // Save the user to the database
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
}
