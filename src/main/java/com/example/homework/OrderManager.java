package com.example.homework;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderManager {

    @Autowired
    private NotificationService notificationService;

    private final OrderRepository orderRepository;

    public OrderManager(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostConstruct
    public void startOrderProcess() {
        notificationService.setOrderRepository(orderRepository);
        System.out.println(notificationService.buildNotificationMessage());
    }
}