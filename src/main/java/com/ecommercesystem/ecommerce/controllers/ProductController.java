package com.ecommercesystem.ecommerce.controllers;


import com.ecommercesystem.ecommerce.entities.Category;
import com.ecommercesystem.ecommerce.entities.Product;
import com.ecommercesystem.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ProductController {

  private ProductService productService;

  @Autowired
  public void setProductService(ProductService productService){
    this.productService = productService;
  }

  @GetMapping(path = "/search_results")
  public String search(Model model){
    model.addAttribute("price", new Product().getPrice());
    model.addAttribute("prodName", new Product().getProdName());
    model.addAttribute("category_name", new Category().getCategory_name());
    return "keyword";
  }

//  @Autowired
//  private ProductRepository productRepository;
//
//  @GetMapping(path="/search_result") // Map ONLY GET Requests
//  public @ResponseBody String getProduct(@RequestParam String prodName, @RequestParam String prodDes,
//                                             @RequestParam float price, @RequestParam String prodBrand,
//                                            @RequestParam Blob prodImage){
//    Product product = new Product();
//    product.setProdName(prodName);
//    product.setProdDesc(prodDes);
//    product.setPrice(price);
//    product.setProdBrand(prodBrand);
//    product.setProdImage(prodImage);
//    productRepository.save(product);
//    return "Saved";
//  }

//  @GetMapping(path="/all")
//  public @ResponseBody Iterable<Product> getAllProduct(){
//    return ProductRepository.findAll();
//  }
}
