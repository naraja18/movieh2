package com.example.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.movie.model.Movie;
import com.example.movie.service.MovieH2Service;

@RestController
public class MovieController {
    @Autowired
    public MovieH2Service apiService;

    @GetMapping("/movies")
    public ArrayList<Movie> getMovies() {
        return apiService.getMovies();
    }

    @PostMapping("/movies")
    public Movie addMovies(@RequestBody Movie movie) {
        return apiService.addMovies(movie);
    }

    @GetMapping("movies/{movieId}")
    public Movie getMovieById(@PathVariable("movieId") int movieId) {
        return apiService.getMovieById(movieId);
    }

    @PutMapping("movies/{movieId}")
    public Movie updateMovie(@PathVariable("movieId") int movieId, @RequestBody Movie movie) {
        return apiService.updateMovie(movieId, movie);
    }

    @DeleteMapping("movies/movieId")
    public void deleteMovie(@PathVariable("movieId") int movieId) {
        apiService.deleteMovie(movieId);
    }
}
