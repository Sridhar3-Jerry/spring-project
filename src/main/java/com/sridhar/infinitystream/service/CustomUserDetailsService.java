//package com.sridhar.infinitystream.service;
//
//import com.sridhar.infinitystream.model.User;
//import com.sridhar.infinitystream.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.core.userdetails.User.UserBuilder;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class CustomUserDetailsService implements UserDetailsService {
//
//    private final UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        // Fetch user from DB using the repository
//        User user = userRepository.findByUserName(userName)
//                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
//
//        // Build Spring Security's UserDetails object
//        UserBuilder builder = org.springframework.security.core.userdetails.User.withUsername(user.getUserName());
//        builder.password(user.getUserPassword());  // Assuming password is already encoded in the DB
//        builder.roles("USER");  // You can set roles dynamically, or fetch from DB if needed
//
//        return builder.build();
//    }
//}
