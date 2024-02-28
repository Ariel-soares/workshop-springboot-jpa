package com.ariel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ariel.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
