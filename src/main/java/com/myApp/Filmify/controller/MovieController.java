package com.myApp.Filmify.controller;

import com.myApp.Filmify.model.Movie;
import com.myApp.Filmify.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/movies")
public class MovieController {
    private MovieService movieService;

    @GetMapping("/")
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> Movies = movieService.findAllMovies();
        return new ResponseEntity<>(Movies, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable("id") long id) {
        Movie Movie = movieService.findMovieById(id);
        return new ResponseEntity<>(Movie, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Movie> addMovie(@RequestBody Movie Movie) {
        Movie _Movie = movieService.addMovie(Movie);
        return new ResponseEntity<>(_Movie, HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<Movie> editMovie(@RequestBody Movie Movie) {
        Movie _Movie = movieService.editMovie(Movie);
        return new ResponseEntity<>(_Movie, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMovie(@PathVariable("id") long id) {
        movieService.deleteMovie(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}