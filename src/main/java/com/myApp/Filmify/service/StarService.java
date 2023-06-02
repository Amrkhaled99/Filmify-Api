package com.myApp.Filmify.service;

import com.myApp.Filmify.exception.NotFoundException;
import com.myApp.Filmify.model.Star;
import com.myApp.Filmify.repository.StarRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class StarService {
    @Autowired
    private final StarRepo starRepo;


    // Create Star
    public Star addStar(Star Star) {
        return starRepo.save(Star);
    }

    // Update Star
    public Star editStar(Star Star) {
        return starRepo.save(Star);
    }

    // Delete Star
    public void deleteStar(Long id) {
        starRepo.deleteById(id);
    }

    // Get Star by ID
    public Star findStarById(Long id) {
//        return StarRepo.findById(id).orElse(null);
        return starRepo.findById(id).orElseThrow(() -> new NotFoundException("Star by Id" + id + "was not found"));

    }


    // Get ALL Stars
    public List<Star> findAllStars() {
        return starRepo.findAll();
    }

}

