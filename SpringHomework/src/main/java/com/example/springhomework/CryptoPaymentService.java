package com.example.springhomework;

import org.springframework.stereotype.Service;

@Service
public class CryptoPaymentService implements TransactionService {

    @Override
    public void processTransaction(double amount) {
        System.out.println("Crypto payment completed: " + amount);
    }
}