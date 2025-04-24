//package com.sridhar.infinitystream.security;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//
//@Component
//public class JwtFilter extends OncePerRequestFilter {
//
//    private final JwtUtil jwtUtil;
//    private final UserDetailsService userDetailsService;
//
//    // Constructor Injection for JwtUtil and UserDetailsService
//    public JwtFilter(JwtUtil jwtUtil, UserDetailsService userDetailsService) {
//        this.jwtUtil = jwtUtil;
//        this.userDetailsService = userDetailsService;
//    }
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        // Extract the Authorization header
//        String authHeader = request.getHeader("Authorization");
//
//        // Check if Authorization header contains "Bearer token"
//        if (authHeader != null && authHeader.startsWith("Bearer ")) {
//            String token = authHeader.substring(7); // Remove "Bearer "
//
//            // Extract username from token
//            String username = jwtUtil.extractUsername(token);
//
//            // If username is not null and authentication is not already set
//            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//                // Load user details from UserDetailsService
//                var userDetails = userDetailsService.loadUserByUsername(username);
//
//                // Validate the token
//                if (jwtUtil.validateToken(token, userDetails)) {
//                    // Create the authentication token
//                    UsernamePasswordAuthenticationToken authToken =
//                            new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//
//                    // Set authentication in the SecurityContext
//                    SecurityContextHolder.getContext().setAuthentication(authToken);
//                }
//            }
//        }
//
//        // Continue the filter chain
//        filterChain.doFilter(request, response);
//    }
//}
