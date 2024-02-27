package com.ariel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ariel.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
