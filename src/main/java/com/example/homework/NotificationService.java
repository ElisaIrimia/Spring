package com.example.homework;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private OrderRepository orderRepository;

    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public String buildNotificationMessage() {
        return "Notification sent for: " + orderRepository.getOrderInfo();
    }
}