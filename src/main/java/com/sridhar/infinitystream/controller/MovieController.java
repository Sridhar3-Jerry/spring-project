package com.sridhar.infinitystream.controller;

import com.sridhar.infinitystream.model.Movie;
import com.sridhar.infinitystream.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie")
@CrossOrigin(origins = "http://127.0.0.1:5501")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // Add a New Movie
    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        // TODO: Add validation for the Movie object from Request
        return movieService.addMovie(movie);
    }

    // Get All Movies
    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    // Get Movie by ID
    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int id) {
        Movie movie = movieService.getMovieById(id);
        return movie != null ? ResponseEntity.ok(movie) : ResponseEntity.notFound().build();
    }

    // Delete Movie
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMovie(@PathVariable int id) {
        if (movieService.existsById(id)) {
            movieService.deleteMovie(id);
            return ResponseEntity.ok("Movie deleted successfully!");
        } else {
            return ResponseEntity.ok("Movie already deleted or not found.");
        }
    }


    @GetMapping("/search")
    public ResponseEntity<List<Movie>> searchMovies(@RequestParam("query") String query) {
        List<Movie> movies = movieService.searchMovies(query);
        return ResponseEntity.ok(movies);
    }

    // Get Movies by Category
    // Get Movies by Category
    @GetMapping(params = "category")
    public List<Movie> getMoviesByCategory(@RequestParam String category) {
        return movieService.getMoviesByCategory(category);
    }

    // Update Movie
    @PutMapping("/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable int id, @RequestBody Movie updatedMovie) {
        if (!movieService.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        updatedMovie.setId(id);
        Movie savedMovie = movieService.save(updatedMovie);
        return ResponseEntity.ok(savedMovie);
    }
}
