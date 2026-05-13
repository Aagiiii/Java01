package com.example.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private Integer credits;

    @Column(length = 100)
    private String instructor;

    public Course() {}

    public Long    getId()            { return id; }
    public void    setId(Long id)     { this.id = id; }
    public String  getTitle()         { return title; }
    public void    setTitle(String t) { this.title = t; }
    public String  getDescription()   { return description; }
    public void    setDescription(String d) { this.description = d; }
    public Integer getCredits()       { return credits; }
    public void    setCredits(Integer c)    { this.credits = c; }
    public String  getInstructor()    { return instructor; }
    public void    setInstructor(String i)  { this.instructor = i; }
}
