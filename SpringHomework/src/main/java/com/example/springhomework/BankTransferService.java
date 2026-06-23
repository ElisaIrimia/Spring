package com.example.springhomework;

import org.springframework.stereotype.Service;

@Service
public class BankTransferService implements TransactionService {

    @Override
    public void processTransaction(double amount) {
        System.out.println("Bank transfer completed: " + amount);
    }
}