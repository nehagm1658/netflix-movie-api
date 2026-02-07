package com.example.netflixdemo.controller;

import com.example.netflixdemo.model.Movie;
import com.example.netflixdemo.service.MovieService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public ResponseEntity<Movie> addMovie(@Valid @RequestBody Movie movie) {
        Movie savedMovie = movieService.addMovie(movie);
        return new ResponseEntity<>(savedMovie, HttpStatus.CREATED);
    }

   @GetMapping("/{id}")
public ResponseEntity<?> getMovieById(@PathVariable Long id) {
    Optional<Movie> movieOptional = movieService.getMovieById(id);

    if (movieOptional.isPresent()) {
        return ResponseEntity.ok(movieOptional.get());
    } else {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body("Movie not found with id: " + id);
    }
}

    }

