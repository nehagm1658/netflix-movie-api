package com.example.netflixdemo.service;

import com.example.netflixdemo.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final List<Movie> movieList = new ArrayList<>();
    private Long idCounter = 1L;

    // Add a new movie
    public Movie addMovie(Movie movie) {
        movie.setId(idCounter++);
        movieList.add(movie);
        return movie;
    }

    // Get movie by ID
    public Optional<Movie> getMovieById(Long id) {
        return movieList.stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst();
    }
}
