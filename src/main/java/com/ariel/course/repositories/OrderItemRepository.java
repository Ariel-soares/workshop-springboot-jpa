package com.ariel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ariel.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
