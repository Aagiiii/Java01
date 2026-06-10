package com.example.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.dto.FilmDto;
import com.example.model.Film;
import com.example.repository.FilmRepository;

@Service
public class FilmService {
    private final FilmRepository filmRepository;

    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public Page<FilmDto> getFilmsPaginated(int page, int size, String search){
        Pageable pageable = PageRequest.of(page, size);
        Page<Film> filmPage;

        if (search == null || search.trim().isEmpty()) {
            filmPage = filmRepository.findAll(pageable);
        } else{
            filmPage = filmRepository.searchFilms(search.trim(), pageable);
        }
        return filmPage.map(this::convertToDo);
    }


    private FilmDto convertToDo(Film film){
        return new FilmDto(
            film.getFilmId(),
             film.getTitle(), 
             film.getDescription(), 
             film.getReleaseYear(), 
             film.getRentalRate(),
             film.getLength(),
              film.getRating());
    }
}
