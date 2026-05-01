package com.example.service;

import java.util.List;

import com.example.model.Order;


public interface OrderService {
     Order createOrder(Long customerId);
    Order addItem(Long orderId, Long productId, int quantity);
    Order processOrder(Long orderId);
    Order shipOrder(Long orderId);
    List<Order> findAll();
}
