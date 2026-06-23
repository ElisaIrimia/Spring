package com.example.springhomework;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TransactionManager {

    private final TransactionService transactionService;

    @Value("${bank.name}")
    private String bankName;

    @Value("${customer.name}")
    private String customerName;

    @Value("${transaction.amount}")
    private double amount;

    public TransactionManager(
            @Qualifier("cardPaymentService")
            TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostConstruct
    public void executeTransaction() {
        System.out.println("Bank: " + bankName);
        System.out.println("Customer: " + customerName);
        transactionService.processTransaction(amount);
    }
}