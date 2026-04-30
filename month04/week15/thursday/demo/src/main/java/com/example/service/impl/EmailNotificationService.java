package com.example.service.impl;

import com.example.service.NotificationService;

public class EmailNotificationService implements NotificationService {

    @Override
    public String getType() {
        return "Email";
       
    }

    @Override
    public void send(String to, String message) {
       System.out.println("[EMAIL] TO: " + to);
       System.out.println("[EMAIL] FROM: " + message);
    }

    
    
    
}
