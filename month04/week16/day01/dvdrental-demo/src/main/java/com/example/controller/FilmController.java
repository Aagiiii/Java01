package com.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Film;
import com.example.repository.FilmRepository;

@Controller
@RequestMapping("/api")
public class FilmController {
    private final FilmRepository filmRepository;

    public FilmController(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @GetMapping("/health")
    public ResponseEntity<Map<String, Object>> health() {

        long count = filmRepository.countAll();
        return ResponseEntity.ok(Map.of("status", "UP", "film_count", count));
    }

    @GetMapping("/films")
    public ResponseEntity<List<Film>> getFilms(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "20") int size) {
        int offset = (page - 1) * size;
        return ResponseEntity.ok(filmRepository.findAll(size, offset));
    }

    @GetMapping("/films/{id}")
    public ResponseEntity<Film> getFilm(@PathVariable("id") int id) {
        return filmRepository.findbyId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/films/search")
    public ResponseEntity<List<Film>> search(@RequestParam(required = false) String title

    ) {
        List<Film> results = filmRepository.search(title);
        return results.isEmpty() ? ResponseEntity.notFound().build():ResponseEntity.ok(results);
    }
}
