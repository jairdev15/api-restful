package com.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Order;
import com.rest.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;
	@Override
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	@Override
	public Optional<Order> getOrderById(Long id) {
		return orderRepository.findById(id);
	}

	@Override
	public Order createOrder(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public Optional<Order> updateOrder(Long id, Order orderDetails) {
		return orderRepository.findById(id)
	            .map(order -> {
	                order.setUser(orderDetails.getUser());
	                order.setProducts(orderDetails.getProducts());
	                return orderRepository.save(order);
	            });
	}

	@Override
	public void deleteOrder(Long id) {
		orderRepository.deleteById(id);		
	}
	
}
