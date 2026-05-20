package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // findAll(), findById(), save(), deleteById() — автоматаар
    List<Customer> findByActiveTrue(); // active=true customer-ууд

    List<Customer> findByLastNameContainingIgnoreCase(String name);
}
