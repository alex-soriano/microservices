package com.litethinking.microservices.reto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.litethinking.microservices.reto1.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
