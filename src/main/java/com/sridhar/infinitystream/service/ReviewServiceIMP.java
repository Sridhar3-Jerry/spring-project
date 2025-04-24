//package com.sridhar.infinitystream.service;
//
//
//import com.sridhar.infinitystream.dto.ReviewDTO;
//import com.sridhar.infinitystream.model.Movie;
//import com.sridhar.infinitystream.model.Review;
//import com.sridhar.infinitystream.model.User;
//import com.sridhar.infinitystream.repository.MovieRepository;
//import com.sridhar.infinitystream.repository.ReviewRepository;
//import com.sridhar.infinitystream.repository.ReviewService;
//import com.sridhar.infinitystream.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ReviewServiceIMP implements ReviewService {
//
//
//    @Autowired
//    private ReviewRepository reviewRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private MovieRepository movieRepository;
//
//    @Override
//    public Review addReview(ReviewDTO reviewDTO) {
//        Review review = new Review();
//        review.setComment(reviewDTO.getComment());
//        review.setRating(reviewDTO.getRating());
//
//        Movie movie = movieRepository.findById(reviewDTO.getMovieId())
//                .orElseThrow(() -> new RuntimeException("Movie not found"));
//
//        User user = userRepository.findById(reviewDTO.getUserId())
//                .orElseThrow(() -> new RuntimeException("User not found"));
//
//        review.setMovie(movie);
//        review.setUser(user);
//
//        return reviewRepository.save(review);
//    }
//
//
//    @Override
//    public List<Review> getReviewsByMovie(int movieId) {
//        return reviewRepository.findByMovieId(movieId);
//    }
//}
