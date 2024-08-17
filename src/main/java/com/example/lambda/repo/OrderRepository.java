package com.example.lambda.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lambda.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	public Order findByName(String name);
}
