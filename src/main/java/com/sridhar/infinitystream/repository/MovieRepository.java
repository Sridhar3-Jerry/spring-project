package com.sridhar.infinitystream.repository;

import com.sridhar.infinitystream.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    // Custom query to search movies by movieName or movieGenre
    @Query("SELECT m FROM Movie m WHERE LOWER(m.movieName) LIKE LOWER(CONCAT('%', :searchTerm, '%')) " +
            "OR LOWER(m.movieGenre) LIKE LOWER(CONCAT('%', :searchTerm, '%'))")
    List<Movie> searchMovies(@Param("searchTerm") String searchTerm);

    // Method to find movies by category (if category is a field in Movie)
    List<Movie> findByCategory(String category);
}
