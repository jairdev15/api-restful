package com.rest.service;

import java.util.List;
import java.util.Optional;

import com.rest.entity.Order;

public interface OrderService {

	List<Order> getAllOrders();
    Optional<Order> getOrderById(Long id);
    Order createOrder(Order order);
    Optional<Order> updateOrder(Long id, Order orderDetails);
    void deleteOrder(Long id);
    
}
