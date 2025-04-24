package com.sridhar.infinitystream.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Enable CORS for API paths or modify path as needed
        registry.addMapping("/**")  // Allow all paths (if you want to enable CORS for all endpoints)
                .allowedOrigins("http://127.0.0.1:5501", "http://localhost:5501")  // Allow frontend origins
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // Allow necessary HTTP methods
                .allowedHeaders("*")  // Allow all headers
                .allowCredentials(true)  // Allow credentials like cookies
                .maxAge(3600);  // Cache preflight response for 1 hour
    }
}
