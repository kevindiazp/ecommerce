package com.ecommercesystem.ecommerce.controllers;

import com.ecommercesystem.ecommerce.entities.Category;
import com.ecommercesystem.ecommerce.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/" )
public class CategoryController {

  @Autowired
  private CategoryRepository categoryRepository;

  @GetMapping(path="/search")
  public @ResponseBody String getCategory(@RequestParam String category_name){
    Category category = new Category();
    category.setCategory_name(category_name);
    categoryRepository.save(category);
    return "saved";
  }
}
