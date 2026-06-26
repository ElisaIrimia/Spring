package com.example.homework;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

    public String getOrderInfo() {
        return "Order #101 - Laptop";
    }
}