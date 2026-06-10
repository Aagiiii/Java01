package com.example.controller;


import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.FilmDto;
import com.example.service.FilmService;

@RestController
@RequestMapping("/api/films")
@CrossOrigin(origins = "http://localhost:4200")
public class FilmController {
    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }
    
    @GetMapping
    public ResponseEntity<Page<FilmDto>> getFilms(
        @RequestParam(defaultValue="0") int page,
         @RequestParam(defaultValue="10") int size,
          @RequestParam(defaultValue="") String search

    ){
        Page<FilmDto> output = filmService.getFilmsPaginated(page, size, search);
        return ResponseEntity.ok(output);
    }
    
    
}
