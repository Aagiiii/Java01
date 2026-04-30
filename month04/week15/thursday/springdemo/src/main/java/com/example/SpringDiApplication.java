package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.app.ShopApp;
import com.example.config.ShopConfig;

@SpringBootApplication
public class SpringDiApplication implements CommandLineRunner
{
    private final ShopApp   shopApp;    // Spring автоматаар inject хийнэ
    private final ShopConfig shopConfig; // Spring автоматаар inject хийнэ

    public SpringDiApplication(ShopApp shopApp, ShopConfig shopConfig) {
        this.shopApp    = shopApp;
        this.shopConfig = shopConfig;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDiApplication.class, args);
    }

    @Override
    public void run(String... args) {
        shopConfig.printConfig();
        System.out.println();
        shopApp.processOrder("ORD-001", "customer@example.com", 99.99);
    }
}
