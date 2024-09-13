package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
