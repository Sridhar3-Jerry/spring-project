//package com.sridhar.infinitystream.service;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Service;
//
//import java.util.Date;
//
//@Service
//public class JwtService {
//
//    private final String SECRET = "secret_key_123"; // secret for signing
//
//    //  1. Generate JWT Token
//    public String generateToken(String username) {
//        return Jwts.builder()
//                .setSubject(username)
//                .setIssuedAt(new Date())
//                .setExpiration(new Date(System.currentTimeMillis() + 86400000)) // 1 day
//                .signWith(SignatureAlgorithm.HS256, SECRET)
//                .compact();
//    }
//
//    //  2. Extract username from JWT token
//    public String extractUsername(String token) {
//        return getClaims(token).getSubject();
//    }
//
//    //  3. Validate JWT token
//    public boolean validateToken(String token, UserDetails userDetails) {
//        final String username = extractUsername(token);
//        return username.equals(userDetails.getUsername()) && !isTokenExpired(token);
//    }
//
//    // 4. Check if token is expired
//    private boolean isTokenExpired(String token) {
//        return getClaims(token).getExpiration().before(new Date());
//    }
//
//    //  5. Get all claims
//    private Claims getClaims(String token) {
//        return Jwts.parser()
//                .setSigningKey(SECRET)
//                .parseClaimsJws(token)
//                .getBody();
//    }
//}
