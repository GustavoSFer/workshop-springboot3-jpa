package com.fernandes.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fernandes.courseSpring.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
