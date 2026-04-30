package com.example.service.impl;

import org.springframework.stereotype.Component;

import com.example.service.NotificationService;

@Component("emailNotification")
public class EmailNotificationService implements NotificationService {

     @Override
    public void send(String to, String message) {
       System.out.println("[EMAIL] TO: " + to);
       System.out.println("[EMAIL] FROM: " + message);
    }

    @Override
    public String getType() {
        return "Email";
       
    }


    
}
