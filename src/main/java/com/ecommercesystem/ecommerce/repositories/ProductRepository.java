package com.ecommercesystem.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommercesystem.ecommerce.entities.Product;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called productRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
  Optional<Product> findByProdName(String prodName);
}
