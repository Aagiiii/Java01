package com.example.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.service.PaymentProcessor;

@Component("paypal")
@Primary
public class PaypalPaymentProcessor  implements PaymentProcessor{

    @Override
    public boolean process(String orderId, double amount) {
        System.out.println("Paypal: $ " + amount + "for" + orderId);
       return true;
    }

    @Override
    public String getName() {
       return "Paypal";
    }
    
    
}
