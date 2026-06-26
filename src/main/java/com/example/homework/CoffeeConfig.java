package com.example.homework;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CoffeeConfig {

    @Value("${coffee.type}")
    private String coffeeType;

    public String getCoffeeType() {
        return coffeeType;
    }
}