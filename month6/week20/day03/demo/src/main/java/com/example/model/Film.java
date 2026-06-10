package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="film")
public class Film {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="film_id")
    private Long filmId;
    
    @Column(nullable=false)
    private String title;

    @Column(columnDefinition="text")
    private String description;

    @Column(name = "release_year", columnDefinition="year")
    private Integer releaseYear;

    private Integer length;

    @Column(columnDefinition="mpaa_rating")
    private String rating;

    @Column(name="rental_rate", nullable=false)
    private Double rentalRate;

    public Film(){}

    public Long getFilmId() {
        return filmId;
    }

    public void setFilmId(Long filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(Double rentalRate) {
        this.rentalRate = rentalRate;
    }

    
    
}
