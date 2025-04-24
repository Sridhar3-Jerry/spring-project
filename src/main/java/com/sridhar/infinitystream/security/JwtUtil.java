//package com.sridhar.infinitystream.security;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//
//@Component
//public class JwtUtil {
//
//    private final String SECRET_KEY = "secret_key_123"; // Use a more secure secret in production
//
//    // Generate JWT Token
//    public String generateToken(String username) {
//        return Jwts.builder()
//                .setSubject(username)
//                .setIssuedAt(new Date())
//                .setExpiration(new Date(System.currentTimeMillis() + 86400000)) // 1 day validity
//                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
//                .compact();
//    }
//
//    // Extract username from JWT Token
//    public String extractUsername(String token) {
//        return extractClaim(token, Claims::getSubject);
//    }
//
//    // Extract expiration date from JWT Token
//    public Date extractExpiration(String token) {
//        return extractClaim(token, Claims::getExpiration);
//    }
//
//    // Generic method to extract claims
//    private <T> T extractClaim(String token, ClaimsResolver<T> claimsResolver) {
//        final Claims claims = extractAllClaims(token);
//        return claimsResolver.resolve(claims);
//    }
//
//    // Extract all claims
//    private Claims extractAllClaims(String token) {
//        return Jwts.parser()
//                .setSigningKey(SECRET_KEY)
//                .parseClaimsJws(token)
//                .getBody();
//    }
//
//    // Check if token is expired
//    public boolean isTokenExpired(String token) {
//        return extractExpiration(token).before(new Date());
//    }
//
//    // Validate token using username
//    public boolean validateToken(String token, String username) {
//        return username.equals(extractUsername(token)) && !isTokenExpired(token);
//    }
//
//    // Validate token using UserDetails (used in JwtFilter)
//    public boolean validateToken(String token, UserDetails userDetails) {
//        String username = extractUsername(token);
//        return username.equals(userDetails.getUsername()) && !isTokenExpired(token);
//    }
//
//    // Functional interface to extract claims
//    @FunctionalInterface
//    private interface ClaimsResolver<T> {
//        T resolve(Claims claims);
//    }
//}
