package com.example.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@RestController
@RequestMapping("api/students")
@CrossOrigin(origins="*")
public class StudentController {
    private final StudentRepository stuRepo;

    public StudentController(StudentRepository stuRepo) {
        this.stuRepo = stuRepo;
    }

     @GetMapping
    public ResponseEntity<List<Student>> getAll() {
        return ResponseEntity.ok(stuRepo.findAll());
    }

    @GetMapping("/{email}")
    public ResponseEntity<Student> getById(@PathVariable String email) {
        return stuRepo.findByEmail(email).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    // StudentController.java-д нэмэх

// GET /api/students/search?email=bat@example.com
// GET /api/students/search?name=бат
// GET /api/students/search?grade=3
@GetMapping("/search")
public ResponseEntity<?> search(
        @RequestParam(required = false) String email,
        @RequestParam(required = false) String name,
        @RequestParam(required = false) Integer grade) {

    if (email != null) {
        return stuRepo.findByEmail(email)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }
    if (name != null) {
        return ResponseEntity.ok(stuRepo.findAllByFirstNameContainingIgnoreCase(name));
    }
    if (grade != null) {
        return ResponseEntity.ok(stuRepo.findByGrade(grade));
    }
    return ResponseEntity.ok(stuRepo.findAll());
}
     // POST — create new student ← ADD THIS
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return stuRepo.save(student);
    }
}
