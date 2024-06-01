package com.shopping.products.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.products.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	Page<Product> findByCategoryId(Long categoryId, Pageable pageable);
}