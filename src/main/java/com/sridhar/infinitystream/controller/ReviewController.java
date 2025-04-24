//package com.sridhar.infinitystream.controller;
//
//
//import com.sridhar.infinitystream.dto.ReviewDTO;
//import com.sridhar.infinitystream.model.Review;
//import com.sridhar.infinitystream.repository.ReviewRepository;
//import com.sridhar.infinitystream.repository.ReviewService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.*;
//
//@RestController
//@RequestMapping("/api/reviews")
//public class ReviewController {
//
//    private final ReviewService reviewService;
//
//    @Autowired
//    public ReviewController(ReviewService reviewService) {
//        this.reviewService = reviewService;
//    }
//
//    @PostMapping("/add")
//    public ResponseEntity<?> addReview(@RequestBody ReviewDTO reviewDTO){
//        return ResponseEntity.ok(reviewService.addReview(reviewDTO));
//    }
//
//    @GetMapping("/movie/{movieID}")
//    public ResponseEntity<List<Review>> getReviewsByMovie(@PathVariable int movieId){
//        return ResponseEntity.ok(reviewService.getReviewsByMovie(movieId));
//    }
//}
