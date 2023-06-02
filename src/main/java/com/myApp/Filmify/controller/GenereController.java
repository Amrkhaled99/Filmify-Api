package com.myApp.Filmify.controller;

import com.myApp.Filmify.model.Genere;
import com.myApp.Filmify.service.GenereService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor

@RequestMapping("/generes")


public class GenereController {
    private GenereService genereService;


    @GetMapping("/")
    public ResponseEntity<List<Genere>> getAllGeneres() {
        List<Genere> Generes = genereService.findAllGeneres();
        return new ResponseEntity<>(Generes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Genere> getGenereById(@PathVariable("id") long id) {
        Genere Genere = genereService.findGenereById(id);
        return new ResponseEntity<>(Genere, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Genere> addGenere(@RequestBody Genere genere) {
        Genere _Genere = genereService.addGenere(genere);
        return new ResponseEntity<>(_Genere, HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<Genere> editGenere(@RequestBody Genere Genere) {
        Genere _Genere = genereService.editGenere(Genere);
        return new ResponseEntity<>(_Genere, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteGenere(@PathVariable("id") long id) {
        genereService.deleteGenere(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
