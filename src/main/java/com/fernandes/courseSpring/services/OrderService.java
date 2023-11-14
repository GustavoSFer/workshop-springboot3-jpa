package com.fernandes.courseSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.fernandes.courseSpring.entities.Order;
import com.fernandes.courseSpring.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order finById(Long id) {
		Optional<Order> obj = repository.findById(id);
		
		return obj.get();
	}

}
