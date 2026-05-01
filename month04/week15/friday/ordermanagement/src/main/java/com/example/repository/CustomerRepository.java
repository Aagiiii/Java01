package com.example.repository;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.model.Customer;

import jakarta.annotation.PostConstruct;

@Repository
public class CustomerRepository {
    private final Map<Long, Customer> customers = new HashMap<>();

    @PostConstruct                   // ← Bean үүссэний дараа нэг удаа дуудагдана
    public void init() {
        save(new Customer(1L, "Bat", "bat@email.com", "99001122"));
        save(new Customer(2L, "Bold", "bold@email.com", "99003344"));
        save(new Customer(3L, "Sarnai", "sarnai@email.com", "99005566"));
        // TODO: Bold болон Sarnai нэм
        System.out.println("[CustomerRepository] " + customers.size() + " customers loaded");
    }

    public Customer save(Customer customer) {
        // TODO: customers map-д хадгал, customer-ийг буцаа
        customers.put(customer.getId(), customer);
        return customer;
    }

    public Optional<Customer> findById(Long id) {
        // TODO: map-аас id-гаар ол, Optional.ofNullable ашигла
        return Optional.ofNullable(customers.get(id));
    }

    public List<Customer> findAll() {
        // TODO: map-ийн бүх утгыг List болгон буцаа
        return new ArrayList<>(customers.values());
    }
}
