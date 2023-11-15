package com.fernandes.courseSpring.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fernandes.courseSpring.entities.Order;
import com.fernandes.courseSpring.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	OrderService orderService;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> orders = orderService.findAll();
		
		return ResponseEntity.ok().body(orders);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(Long id) {
		Order obj = orderService.finById(id);
		
		return ResponseEntity.ok().body(obj);
	}
}
