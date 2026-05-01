package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.app.OrderManagementApp;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class OrderManagementApplication implements CommandLineRunner
{ private final OrderManagementApp orderManagementApp;

    public OrderManagementApplication(OrderManagementApp orderManagementApp) {  // ← нөхөх
        this.orderManagementApp = orderManagementApp;
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderManagementApplication.class, args);              // ← нөхөх
    }

    @Override
    public void run(String... args) {
        orderManagementApp.run();
    }
}
