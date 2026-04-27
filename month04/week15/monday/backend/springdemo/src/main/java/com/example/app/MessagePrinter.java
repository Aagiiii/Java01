package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.service.MessageService;

// @Autowired
@Component
public class MessagePrinter {
    private final MessageService messageService;

    // @ConstructorProperties
    // @Component
    @Autowired
    public MessagePrinter(MessageService messageService) {
        this.messageService = messageService;
    }

    public void print() {
        System.out.println("Language: " + messageService.getLanguage());
        System.out.println("Message:  " + messageService.getMessage());
    }
}