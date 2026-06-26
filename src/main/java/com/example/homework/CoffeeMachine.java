package com.example.homework;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CoffeeMachine {

    private final CoffeeConfig coffeeConfig;

    @Value("${coffee.size}")
    private String coffeeSize;

    public CoffeeMachine(CoffeeConfig coffeeConfig) {
        this.coffeeConfig = coffeeConfig;
    }

    @PostConstruct
    public void prepareCoffee() {
        System.out.println("CoffeeMachine initialized");
        System.out.println("Preparing a " + coffeeSize + " " +
                coffeeConfig.getCoffeeType());
    }
}