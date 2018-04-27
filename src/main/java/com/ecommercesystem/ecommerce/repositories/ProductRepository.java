package com.ecommercesystem.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommercesystem.ecommerce.entities.Product;

// This will be AUTO IMPLEMENTED by Spring into a Bean called productRepository
// CRUD refers Create, Read, Update, Delete
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
