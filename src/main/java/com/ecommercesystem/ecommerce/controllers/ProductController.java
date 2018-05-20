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
import org.thymeleaf.context.WebContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Controller
public class ProductController {


  @Autowired
  ProductRepository productRepository;

  @GetMapping(path = "/")
  public String front() {
    return "index";
  }

  @GetMapping(path = "/search_results")
  public String search(@RequestParam(value = "search", required = false) String search, Model model){
    List<Product> productList = productRepository.findAll();
    model.addAttribute("products" , productList);
//    for (Product product : productList) {
//      if (product.getProdName().contains(search) || product.getProdBrand().contains(search)){
//        model.addAttribute("ID_produk: " + product.getID_product());
//        System.out.println("Product ID: " + product.getID_product());
//        model.addAttribute("price", product.getPrice());
//        System.out.println("Price: " + product.getPrice());
//        model.addAttribute("prodName", product.getProdName());
//        System.out.println("Name: " + product.getProdName());
//        model.addAttribute("category_name", product.getCategory().getCategory_name());
//        System.out.println("Category: " + product.getCategory().getCategory_name());
//        model.addAttribute("prodDesc", product.getProdDesc());
//        model.addAttribute("prodImage", product.getProdImage());
//        model.addAttribute("prodBrand", product.getProdBrand());
//      }
//    }
    //Path variable id
    return "search_results";
  }

  @GetMapping(path = "/item_details")
  public String item(String search, Model model){
    Optional<Product> productName = productRepository.findByProdName(search);
    if (productName.isPresent()){
      if (search.equals(productName.get().getProdName())){
        model.addAttribute("ID_Product", productName.get().getID_product());
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
