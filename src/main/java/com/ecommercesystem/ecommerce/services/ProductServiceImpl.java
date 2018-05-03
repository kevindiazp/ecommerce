//package com.ecommercesystem.ecommerce.services;
//
//import com.ecommercesystem.ecommerce.entities.Product;
//import com.ecommercesystem.ecommerce.repositories.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service("productService")
//public class ProductServiceImpl implements ProductService{
//
//  private ProductRepository productRepository;
//
//  @Autowired
//  public void setProductRepository(ProductRepository productRepository){
//    this.productRepository = productRepository;
//  }
//
//  @Override
//  public Iterable<Product> getAllProducts() {
//    return productRepository.findAll();
//  }
//
//  @Override
//  public Optional<Product> getProductById(Integer ID_product){
//    return productRepository.findById(ID_product);
//  }
//}
