package com.example.service;

import com.example.model.Order;
public interface NotificationService {
    void sendOrderConfirmation(Order order);
    void sendShippingNotification(Order order);
}
