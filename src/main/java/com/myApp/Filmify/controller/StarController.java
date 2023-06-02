package com.myApp.Filmify.controller;

import com.myApp.Filmify.model.Star;
import com.myApp.Filmify.service.StarService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/stars")

public class StarController {
    private StarService starService;

    @GetMapping("/")
    public ResponseEntity<List<Star>> getAllStars() {
        List<Star> Stars = starService.findAllStars();
        return new ResponseEntity<>(Stars, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Star> getStarById(@PathVariable("id") long id) {
        Star Star = starService.findStarById(id);
        return new ResponseEntity<>(Star, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Star> addStar(@RequestBody Star Star) {
        Star _Star = starService.addStar(Star);
        return new ResponseEntity<>(_Star, HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<Star> editStar(@RequestBody Star Star) {
        Star _Star = starService.editStar(Star);
        return new ResponseEntity<>(_Star, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStar(@PathVariable("id") long id) {
        starService.deleteStar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
