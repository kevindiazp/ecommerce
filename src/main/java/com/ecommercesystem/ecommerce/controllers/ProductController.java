package com.ecommercesystem.ecommerce.controllers;


import com.ecommercesystem.ecommerce.entities.Category;
import com.ecommercesystem.ecommerce.entities.Product;
import com.ecommercesystem.ecommerce.repositories.ProductRepository;
//import com.ecommercesystem.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Controller
public class ProductController {


  @Autowired
  ProductRepository productRepository;

//  @Autowired
//  public void setProductService(ProductService productService){
//    this.productService = productService;
//  }

  @GetMapping(path = "/")
  public String front() {
    return "index";
  }

  @GetMapping(path = "/search_results")
  public String search(@RequestParam(value = "search", required = false) String search, Model model){
    Optional<Product> productName = productRepository.findByProdName(search);
    Optional<Product> productBrand = productRepository.findByProdBrand(search);
    if (productName.isPresent()){
      if (search.contains(productName.get().getProdName())){
        model.addAttribute("price", productName.get().getPrice());
        System.out.println("Price: " + productName.get().getPrice());
        model.addAttribute("prodName", productName.get().getProdName());
        System.out.println("Name: " + productName.get().getProdName());
        model.addAttribute("category_name", productName.get().getCategory().getCategory_name());
        System.out.println("Category: " + productName.get().getCategory().getCategory_name());
        model.addAttribute("prodDesc", productName.get().getProdDesc());
        model.addAttribute("prodImage", productName.get().getProdImage());
        model.addAttribute("prodBrand", productName.get().getProdBrand());
      }
    }
    else if (productBrand.isPresent()){
      if (search.contains(productBrand.get().getProdName())){
        model.addAttribute("price", productBrand.get().getPrice());
        model.addAttribute("prodName", productBrand.get().getProdName());
        model.addAttribute("category_name", productBrand.get().getCategory().getCategory_name());
        model.addAttribute("prodDesc", productBrand.get().getProdDesc());
        model.addAttribute("prodImage", productBrand.get().getProdImage());
        model.addAttribute("prodBrand", productBrand.get().getProdBrand());
      }
    }
    return "search_results";
  }

  @GetMapping(path = "/item_details")
  public String item(@RequestParam(value = "search") String search, Model model){
    Optional<Product> productName = productRepository.findByProdName(search);
    if (productName.isPresent()){
      if (search.equals(productName.get().getProdName())){
        model.addAttribute("price", productName.get().getPrice());
        model.addAttribute("prodName", productName.get().getProdName());
        model.addAttribute("category_name", productName.get().getCategory().getCategory_name());
        model.addAttribute("prodDesc", productName.get().getProdDesc());
        model.addAttribute("prodImage", productName.get().getProdImage());
        model.addAttribute("prodBrand", productName.get().getProdBrand());
      }
    }
    return "item_details";
  }
}
