package com.sridhar.infinitystream.service;

import com.sridhar.infinitystream.model.Movie;
import com.sridhar.infinitystream.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(int id) {
        return movieRepository.findById(id).orElse(null);
    }

    public void deleteMovie(int id) {
        movieRepository.deleteById(id);
    }

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public boolean existsById(int id) {
        return movieRepository.existsById(id);
    }

    public List<Movie> searchMovies(String searchTerm) {
        return movieRepository.searchMovies(searchTerm);
    }

    public List<Movie> getMoviesByCategory(String category) {
        return movieRepository.findByCategory(category);
    }
}
