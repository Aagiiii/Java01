
package com.example.controller;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Film;
import com.example.repository.FilmRepository;

@RestController
@RequestMapping("api/films")
@CrossOrigin(origins = "*")
public class FilmController {
    private final FilmRepository filmRepo;

    public FilmController(FilmRepository filmRepo) {
        this.filmRepo = filmRepo;
    }

    @GetMapping
    public ResponseEntity<List<Film>> getAll() {
        return ResponseEntity.ok(filmRepo.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Film> getById(@PathVariable Long id) {
        return filmRepo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

}
