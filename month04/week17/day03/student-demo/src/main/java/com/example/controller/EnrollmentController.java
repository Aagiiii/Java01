package com.example.controller;

// EnrollmentController.java

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Course;
import com.example.model.Enrollment;
import com.example.model.Student;
import com.example.repository.CourseRepository;
import com.example.repository.EnrollmentRepository;
import com.example.repository.StudentRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class EnrollmentController {

    private final EnrollmentRepository enrollRepo;
    private final StudentRepository    studentRepo;
    private final CourseRepository     courseRepo;

    public EnrollmentController(EnrollmentRepository enrollRepo,
                                StudentRepository studentRepo,
                                CourseRepository courseRepo) {
        this.enrollRepo  = enrollRepo;
        this.studentRepo = studentRepo;
        this.courseRepo  = courseRepo;
    }

    // POST /api/enrollments
    @PostMapping("/enrollments")
    public ResponseEntity<?> enroll(@RequestBody Map<String, Long> body) {
        Long studentId = body.get("student_id");
        Long courseId  = body.get("course_id");

        Student student = studentRepo.findById(studentId).orElse(null);
        Course  course  = courseRepo.findById(courseId).orElse(null);

        if (student == null || course == null) {
            return ResponseEntity.badRequest()
                .body(Map.of("error", "student or course not found"));
        }

        Enrollment e = new Enrollment();
        e.setStudent(student);
        e.setCourse(course);
        return ResponseEntity.ok(enrollRepo.save(e));
    }

    // GET /api/students/{id}/courses
    @GetMapping("/students/{id}/courses")
    public ResponseEntity<List<Course>> getStudentCourses(@PathVariable Long id) {
        if (!studentRepo.existsById(id)) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(enrollRepo.findCoursesByStudentId(id));
    }
}