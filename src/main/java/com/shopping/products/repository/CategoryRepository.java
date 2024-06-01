package com.shopping.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.products.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
