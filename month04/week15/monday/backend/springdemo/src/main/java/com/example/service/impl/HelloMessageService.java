package com.example.service.impl;

import org.springframework.stereotype.Component;

import com.example.service.MessageService;

@Component
public class HelloMessageService implements  MessageService{

    @Override
    public String getMessage() {
       return "Hello, Spring!";
    }

    @Override
    public String getLanguage() {
       return "English";
       
    }
    
    
}
