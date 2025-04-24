package com.sridhar.infinitystream.service;

import com.sridhar.infinitystream.model.Movie;
import com.sridhar.infinitystream.model.User;
import com.sridhar.infinitystream.model.WishList;
import com.sridhar.infinitystream.repository.MovieRepository;
import com.sridhar.infinitystream.repository.UserRepository;
import com.sridhar.infinitystream.repository.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishListService {

    @Autowired
    private WishListRepository wishListRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MovieRepository movieRepository;

    public void addToWishlist(User user, Movie movie) {
        // Create a new wishlist entry with user and movie
        WishList wishList = new WishList();
        wishList.setUser(user);
        wishList.setMovie(movie);

        // Save the wishlist to the repository
        wishListRepository.save(wishList);
    }
}
