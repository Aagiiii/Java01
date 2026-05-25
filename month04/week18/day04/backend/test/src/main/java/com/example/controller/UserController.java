package com.example.controller;  // Өөрийн package нэр


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:4200")  // Angular app-д зөвшөөрөх
public class UserController {

    private final UserRepository userRepository;

    // Constructor injection (Spring автоматаар объект өгнө)
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Бүх хэрэглэгчийг авах
    // GET http://localhost:8080/api/users
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Шинэ хэрэглэгч үүсгэх
    // POST http://localhost:8080/api/users
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // ID-аар хэрэглэгч авах
    // GET http://localhost:8080/api/users/1
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return userRepository.findById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }
}