package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    // ── Derived query methods ──────────────────────────────────────────────

    Optional<Student> findByEmail(String email);

    List<Student> findAllByFirstNameContainingIgnoreCase(String name);

    List<Student> findByGrade(Integer grade);

    List<Student> findByGradeLessThanEqual(Integer maxGrade);

    List<Student> findAllByOrderByLastNameAsc();

    // ── @Query — JPQL (SQL-тэй төстэй ч Table нэр биш Entity нэр ашиглана) ───

    // JPQL: table нэр биш Entity class нэр ашиглана
    @Query("SELECT s FROM Student s WHERE s.grade >= :minGrade")
    List<Student> findByMinGrade(@Param("minGrade") Integer minGrade);

    // Native SQL: nativeQuery = true бол жинхэнэ SQL бичиж болно
    @Query(value = "SELECT COUNT(*) FROM student WHERE grade = :grade", nativeQuery = true)
    Long countByGrade(@Param("grade") Integer grade);
}
