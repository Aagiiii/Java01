package com.example.service.impl;

import org.springframework.stereotype.Component;

import com.example.service.PaymentProcessor;

@Component("stripe")
public class StripePaymentProcessor implements PaymentProcessor{

    @Override
    public boolean process(String orderId, double amount) {
       System.out.println("Stripe: $ " + amount + " for " + orderId);
       return true;
    }

    @Override
    public String getName() {
        return "Stripe";
    }
    
    
}
