package com.ecommercesystem.ecommerce.controllers;

import com.ecommercesystem.ecommerce.entities.Product;
import com.ecommercesystem.ecommerce.repositories.InvoiceRepository;
import com.ecommercesystem.ecommerce.repositories.ProductRepository;
import com.ecommercesystem.ecommerce.repositories.UsersRepository;
import com.ecommercesystem.ecommerce.entities.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class UsersController {

  @Autowired
  ProductRepository productRepository;

  @Autowired
  InvoiceRepository invoiceRepository;

  ArrayList<Cart> carts = new ArrayList<>();
  int total;

  @GetMapping(path = "/login")
  public ModelAndView logout(@RequestParam(name = "logout", required=false) String logout) {
    if (logout != null) {
      return new ModelAndView("redirect:/");
    }
    return new ModelAndView("login");
  }

  @GetMapping(path = "/cart/{username}")
  public String cart(@RequestParam(value = "iDProduct", required = false)Integer iDProduct, Model model){
    if(iDProduct != null){
      Optional<Product> product = productRepository.findOneByiDProduct(iDProduct);
//      if(product.isPresent()){
        for (Cart cart: carts){
          if (cart.getProduct().getiDProduct().equals(product.get().getiDProduct())){

            total = 0;
            for (Cart cart1 : carts){
              total += cart1.getAmount();
            }
            model.addAttribute("total", total);
            return "cart";
          }
        }
        carts.add(new Cart(product.get()));
      }
//    }
    model.addAttribute("item", carts);
    total = 0;
    for (Cart cart: carts){
      total += cart.getAmount();
    }
    model.addAttribute("total", total);
    return "cart";
  }

  @GetMapping(path = "/cart/add{iDProduct}")
  public String add(@PathVariable("iDProduct") Integer iDProduct, Model model){
    for (Cart cart : carts){
      if(cart.getProduct().getiDProduct().equals(iDProduct)){
        cart.incrementQuantity();
        break;
      }
    }
    model.addAttribute("product", carts);
    total = 0;
    for (Cart cart : carts){
      total += cart.getAmount();
    }
    model.addAttribute("total", total);
    return "cart";
  }

  @GetMapping(path = "/cart/subtract{iDProduct}")
  public String subtract(@PathVariable("iDProduct") Integer iDProduct, Model model){
    for (Cart cart : carts){
      if(cart.getProduct().getiDProduct().equals(iDProduct)){
        cart.decrementQuantity();
        break;
      }
    }
    model.addAttribute("product", carts);
    total = 0;
    for (Cart cart : carts){
      total += cart.getAmount();
    }
    model.addAttribute("total", total);
    return "cart";
  }
}