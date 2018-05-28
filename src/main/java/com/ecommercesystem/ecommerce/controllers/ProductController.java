package com.ecommercesystem.ecommerce.controllers;


import com.ecommercesystem.ecommerce.entities.Category;
import com.ecommercesystem.ecommerce.entities.Product;
import com.ecommercesystem.ecommerce.repositories.ProductRepository;
//import com.ecommercesystem.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.context.WebContext;

import java.util.List;
import java.util.Optional;


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
    List<Product> productList = productRepository.findByProdNameContains(search);
    model.addAttribute("products" , productList);

//    List<Product> productList1 = productRepository.findByProdBrandContains(search);
//    model.addAttribute("product1", productList1);
    return "search_results";
  }

  @GetMapping(path = "/item_details/{ID_product}")
  public String item(@PathVariable String ID_product, Model model){
//    Product product= productRepository.findByID_product(ID_product);
//    model.addAttribute("products" , product);
//    Optional<Product> productName = productRepository.findByProdName(ID_product);
//    if (productName.isPresent()){
//      model.addAttribute("ID_Product", productName.get().getID_product());
//      model.addAttribute("price", productName.get().getPrice());
//      model.addAttribute("prodName", productName.get().getProdName());
//      model.addAttribute("category_name", productName.get().getCategory().getCategory_name());
//      model.addAttribute("prodDesc", productName.get().getProdDesc());
//      model.addAttribute("prodImage", productName.get().getProdImage());
//      model.addAttribute("prodBrand", productName.get().getProdBrand());
//    }
    return "item_details";
  }
}
