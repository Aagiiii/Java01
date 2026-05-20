package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Rental;

public interface RentalRepository extends JpaRepository<Rental, Integer> {
    // customer-ийн rental-ууд — derived query
    List<Rental> findByCustomer_CustomerId(Integer customerId); // nested: customer.customerId

    // active rental-ууд (return_date байхгүй)
    List<Rental> findByReturnDateIsNull();
}