package com.example.repository;

// EnrollmentRepository.java

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.model.Course;
import com.example.model.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

    List<Enrollment> findByStudentId(Long studentId);
    List<Enrollment> findByCourseId(Long courseId);

    @Query("SELECT e.course FROM Enrollment e WHERE e.student.id = :studentId AND e.status = 'active'")
    List<Course> findCoursesByStudentId(@Param("studentId") Long studentId);
}