package com.ecommercesystem.ecommerce.services;

import com.ecommercesystem.ecommerce.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
  Iterable<Product> getAllProducts();
  public Optional<Product> getProductById(Integer ID_product);

  Optional<Product> findProductName(String prodName);

  String findProductDesc(String prodDesc);

  List<Product> findPrice(String price);

}
