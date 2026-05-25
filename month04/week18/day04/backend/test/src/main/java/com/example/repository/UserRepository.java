package com.example.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional <User> findByEmail(String email);
    boolean existsByEmail(String email);

    Page<User> findByEmailContaining(String email, Pageable pageable);

    // TODO: your code here — findByEmail method
    // TODO: your code here — existsByEmail method
}