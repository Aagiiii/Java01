package com.example.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.model.Order;
import com.example.service.NotificationService;


@Service("smsNotification")
@Primary   // ← NotificationService inject хийхэд @Qualifier байхгүй бол энийг сонгоно
public class SmsNotificationService implements NotificationService {
     @Override
    public void sendOrderConfirmation(Order order) {
        // TODO: дараах хэлбэрт print хий:
        // [SMS] To:  99001122
        // [SMS] Msg: Order #1 confirmed! Total: $1299.98
   
        System.out.println("  [SMS] To:  " + order.getCustomer().getPhone());   // утасны дугаар
        System.out.printf("  [SMS] Msg: Order #%d confirmed! Total: $%.2f%n",
            order.getId(), order.getTotal());
    }

    @Override
    public void sendShippingNotification(Order order) {
        // TODO: дараах хэлбэрт print хий:
        // [SMS] To:  99001122
        // [SMS] Msg: Order #1 is on its way!
        System.out.println("[SMS] To: " + order.getCustomer().getPhone());
        System.out.println("[SMS] Msg: Order #" + order.getId() + " is on its way!");
    }
}
