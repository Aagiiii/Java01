package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.model.Film;

@Repository
public class FilmRepository {
    private final JdbcTemplate jdbcTemplate;

    // Spring boot injects database connection here = like dbeaver
    public FilmRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public long countAll() {
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM film", Long.class);
    }

    public List<Film> findAll(int limit, int offset) {
        String sql = """
                SELECT film_id, title, rating, rental_rate
                FROM film
                ORDER BY title
                LIMIT ? OFFSET ?
                """;
        return jdbcTemplate.query(sql, filmRowMapper(), limit, offset);
    }

    private RowMapper<Film> filmRowMapper() {
        return (rs, rowNumb) -> {
            Film f = new Film();
            f.setFilmId(rs.getInt("film_id"));
            f.setTitle(rs.getString("title"));
            f.setRating(rs.getString("rating"));
            f.setRatingRate(rs.getBigDecimal("rental_rate"));
            return f;
        };
    }
    // find film by id

    public Optional<Film> findbyId(int filmId) {
        String sql = """
                SELECT film_id,title, rating, rental_rate
                FROM film
                WHERE film_id = ?
                """;
        try {
            Film film = jdbcTemplate.queryForObject(sql, filmRowMapper(), filmId);
            return Optional.ofNullable(film);
        } catch (EmptyResultDataAccessException e) {
            // TODO: handle exception
            return Optional.empty();
        }

    }

    // film search

    public List<Film> search(String title) {
        String sql = """
                SELECT film_id,title, rating, rental_rate
                FROM film
                WHERE title like ?
                """;

        return jdbcTemplate.query(sql, filmRowMapper(), "%" + title + "%");

    }

    public 

}
