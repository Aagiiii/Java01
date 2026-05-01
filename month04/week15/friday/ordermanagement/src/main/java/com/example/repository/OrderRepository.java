package com.example.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.model.Order;

@Repository
public class OrderRepository {
    private final Map<Long, Order> orders = new HashMap<>();

    public Order save(Order order) {
        // TODO: хадгал
        orders.put(order.getId(), order);
        return order;
    }

    public Optional<Order> findById(Long id) {
        // TODO: ол
        return Optional.ofNullable(orders.get(id));
    }

    public List<Order> findAll() {
        // TODO: бүгдийг буцаа
        return new ArrayList<>(orders.values());
    }

    public long count() {
        return orders.size();         // ← шинэ order ID тооцоход ашиглана
    }

    public List<Order> findByCustomerId(Long customerId) {
        // TODO: stream().filter() ашиглан тухайн customer-ийн
        //       захиалгуудыг шүүж буцаа
        return orders.values().stream().filter(o -> o.getCustomer().getId().equals(customerId)).toList();
    }
}
