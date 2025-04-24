package com.sridhar.infinitystream.controller;

import com.sridhar.infinitystream.dto.WishListDTO;
import com.sridhar.infinitystream.model.Movie;
import com.sridhar.infinitystream.model.User;
import com.sridhar.infinitystream.model.WishList;
import com.sridhar.infinitystream.service.WishListService;
import com.sridhar.infinitystream.repository.MovieRepository;
import com.sridhar.infinitystream.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/wishlist")
public class WishListController {

    private final WishListService wishListService;
    private final UserRepository userRepository;
    private final MovieRepository movieRepository;

    @Autowired
    public WishListController(WishListService wishListService,
                              UserRepository userRepository,
                              MovieRepository movieRepository) {
        this.wishListService = wishListService;
        this.userRepository = userRepository;
        this.movieRepository = movieRepository;
    }

    @PostMapping("/addwish")
    public ResponseEntity<?> addToWishlist(@RequestBody WishListDTO dto) {
        // Fetch user and movie by their IDs
        User user = userRepository.findById(dto.getUser_id())
                .orElseThrow(() -> new RuntimeException("User not found"));
        Movie movie = movieRepository.findById(dto.getMovie_id())
                .orElseThrow(() -> new RuntimeException("Movie not found"));

        // Call service to save the wishlist
        wishListService.addToWishlist(user, movie);

        return ResponseEntity.ok("Movie added to wishlist successfully!");
    }
}
