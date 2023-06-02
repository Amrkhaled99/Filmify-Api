package com.myApp.Filmify.service;

import com.myApp.Filmify.exception.NotFoundException;
import com.myApp.Filmify.model.Movie;
import com.myApp.Filmify.repository.MovieRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class MovieService {
    @Autowired
    private final MovieRepo MovieRepo;


    // Create Movie
    public Movie addMovie(Movie Movie) {
        return MovieRepo.save(Movie);
    }

    // Update Movie
    public Movie editMovie(Movie Movie) {
        return MovieRepo.save(Movie);
    }

    // Delete Movie
    public void deleteMovie(Long id) {
        MovieRepo.deleteById(id);
    }

    // Get Movie by ID
    public Movie findMovieById(Long id) {
//        return MovieRepo.findById(id).orElse(null);
        return MovieRepo.findById(id).orElseThrow(() -> new NotFoundException("Movie by Id" + id + "was not found"));

    }


    // Get ALL Movies
    public List<Movie> findAllMovies() {
        return MovieRepo.findAll();
    }

    // Get ALL Movies under give genere

    // Get ALL Movies under give star


}
