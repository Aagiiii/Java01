package com.example.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.service.NotificationService;

@Component("smsNotification")
@Primary
public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String to, String message) {
       System.out.println("[SMS] TO: " + to);
       System.out.println("[SMS] FROM: " + message);

    }

    @Override
    public String getType() {
        return "SMS";
    }
    
    
}
