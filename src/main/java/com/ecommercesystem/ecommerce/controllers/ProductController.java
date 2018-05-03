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
import java.util.Optional;

@Controller
public class ProductController {

//  private ProductService productService;
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
    System.out.println("Name: " + productRepository.findByProdName(search).get().getProdName());
    System.out.println("Price: " + productRepository.findByProdName(search).get().getPrice());
    System.out.println("Category: " + productRepository.findByProdName(search).get().getCategory().getCategory_name());
//    Optional<Product> productBrand = productRepository.findByProd_brand(search);
    if (productName.isPresent()){
      if (search.contains(productName.get().getProdName())){
        model.addAttribute("ID_product", productName.get().getID_product());
        model.addAttribute("price", productName.get().getPrice());
        model.addAttribute("prodName", productName.get().getProdName());
        model.addAttribute("category_name", productName.get().getCategory().getCategory_name());
        model.addAttribute("prodDesc", productName.get().getProdDesc());
        model.addAttribute("prodImage", productName.get().getProdImage());
        model.addAttribute("prodBrand", productName.get().getProdBrand());
      }
    }
//    else if (productBrand.isPresent()){
//      if (search.equals(productBrand.get().getProd_brand())){
//        model.addAttribute("ID_product", productBrand.get().getID_product());
//        model.addAttribute("price", productBrand.get().getPrice());
//        model.addAttribute("prodName", productBrand.get().getProdName());
//        model.addAttribute("category_name", productBrand.get().getCategory().getCategory_name());
//        model.addAttribute("prodDesc", productBrand.get().getProdDesc());
//        model.addAttribute("prodImage", productBrand.get().getProdImage());
//        model.addAttribute("prodBrand", productBrand.get().getProdBrand());
//      }
//    }
    return "search_results";
  }

//  @RequestMapping(path = "/item_details")
//  public String item(@RequestParam(value = "item") String search, Model model){
//    Optional<Product> productName = productRepository.findByProd_name(item);
//    if (productName.isPresent()){
//      if (item.equals(productName.get().getProd_name())){
//        model.addAttribute("price", productName.get().getPrice());
//        model.addAttribute("prodName", productName.get().getProd_name());
//        model.addAttribute("category_name", productName.get().getCategory().getCategory_name());
//        model.addAttribute("prodDesc", productName.get().getProd_desc());
//        model.addAttribute("prodImage", productName.get().getProd_image());
//        model.addAttribute("prodBrand", productName.get().getProd_brand());
//      }
//    }
//    return "item_details";
//  }
}
