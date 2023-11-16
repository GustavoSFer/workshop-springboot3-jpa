package com.fernandes.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandes.courseSpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
