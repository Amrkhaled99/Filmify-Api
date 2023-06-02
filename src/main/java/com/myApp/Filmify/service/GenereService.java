package com.myApp.Filmify.service;

import com.myApp.Filmify.exception.NotFoundException;
import com.myApp.Filmify.model.Genere;
import com.myApp.Filmify.repository.GenereRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GenereService {

    @Autowired
    private final GenereRepo genereRepo;


    // Create Genere
    public Genere addGenere(Genere genere) {
        return genereRepo.save(genere);
    }

    // Update Genere
    public Genere editGenere(Genere genere) {
        return genereRepo.save(genere);
    }

    // Delete Genere
    public void deleteGenere(Long id) {
        genereRepo.deleteById(id);
    }

    // Get Genere by ID
    public Genere findGenereById(Long id) {
//        return GenereRepo.findById(id).orElse(null);
        return genereRepo.findById(id).orElseThrow(() -> new NotFoundException("Genere by Id" + id + "was not found"));

    }


    // Get ALL Generes
    public List<Genere> findAllGeneres() {
        return genereRepo.findAll();
    }

}
