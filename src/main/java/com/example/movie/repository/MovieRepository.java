package com.example.movie.repository;

import java.util.*;
import com.example.movie.model.Movie;

public interface MovieRepository {
    ArrayList<Movie> getMovies();

    Movie addMovies(Movie movie);

    Movie getMovieById(int movieId);

    Movie updateMovie(int movieId, Movie movie);

    void deleteMovie(int movieId);
}
