package com.ecommercesystem.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommercesystem.ecommerce.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called productRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
  List<Product> findByProdNameContains(String prodName);
  Optional<Product> findOneByiDProduct(Integer iDProduct);
//  Product findByID_product(String ID_product)
//  List<Product> findByProdBrandContains(String prodBrand);
}
