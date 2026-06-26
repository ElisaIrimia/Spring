package com.example.homework;

import org.springframework.stereotype.Service;

@Service
public class CardPaymentService implements TransactionService {

    @Override
    public void processTransaction(double amount) {
        System.out.println("Card payment completed: " + amount);
    }
}