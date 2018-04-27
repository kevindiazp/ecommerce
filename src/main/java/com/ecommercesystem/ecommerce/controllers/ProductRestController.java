package com.ecommercesystem.ecommerce.controllers;

import com.ecommercesystem.ecommerce.entities.Product;
import com.ecommercesystem.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProductRestController {

  @Autowired
  private ProductService productService;

  @GetMapping(path = "/api/products")
  public Iterable<Product> getAllProducts(){
    return productService.getAllProducts();
  }

  @GetMapping(path = "/api/products/{id}")
  public Optional<Product> getProductById(@PathVariable("ID_product") Integer ID_product){
    return productService.getProductById(ID_product);
  }
}
