package com.ecommercesystem.ecommerce.controllers;


import com.ecommercesystem.ecommerce.entities.Category;
import com.ecommercesystem.ecommerce.entities.Product;
import com.ecommercesystem.ecommerce.repositories.ProductRepository;
import com.ecommercesystem.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class ProductController {

  private ProductService productService;
  @Autowired
  ProductRepository productRepository;

  @Autowired
  public void setProductService(ProductService productService){
    this.productService = productService;
  }

  @GetMapping(path = "/")
  public String front() {
    return "index";
  }
  @GetMapping (path = "/search_results")
  public String search(@RequestParam(value = "search") String search, Model model){
    Optional<Product> product = productRepository.findByProdName(search);
    if (product.isPresent()){
      model.addAttribute("price", product.get().getPrice());
      model.addAttribute("prodName", product.get().getProdName());
      model.addAttribute("category_name", product.get().getCategory().getCategory_name());
      model.addAttribute("prodDesc", product.get().getProdDesc());
      model.addAttribute("prodImage", product.get().getProdImage());
      model.addAttribute("prodBrand", product.get().getProdBrand());
    }
    return "search_results";
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
