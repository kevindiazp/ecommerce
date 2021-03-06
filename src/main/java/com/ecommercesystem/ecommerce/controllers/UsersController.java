package com.ecommercesystem.ecommerce.controllers;

import com.ecommercesystem.ecommerce.entities.Invoice;
import com.ecommercesystem.ecommerce.entities.Product;
import com.ecommercesystem.ecommerce.entities.Users;
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
  UsersRepository usersRepository;

  @Autowired
  ProductRepository productRepository;

  @Autowired
  InvoiceRepository invoiceRepository;

  ArrayList<Cart> carts = new ArrayList<>();
  int total;
  int quantity;
  int amount;

  @GetMapping(path = "/login")
  public ModelAndView logout(@RequestParam(name = "logout", required=false) String logout) {
    if (logout != null) {
      return new ModelAndView("redirect:/");
    }
    return new ModelAndView("login");
  }

  @GetMapping(path = "/cart/{iDProduct}")
  public String cart(@PathVariable("iDProduct") Integer iDProduct, Model model){
    if(iDProduct != null){
      Optional<Product> product = productRepository.findOneByiDProduct(iDProduct);
//        Optional<Users> users = usersRepository.findByUsername(username);
      if(product.isPresent()){
        carts.add(new Cart(product.get()));
        total = 0;
        quantity = 0;
        for (Cart cart: carts){
          if (cart.getProduct().getiDProduct().equals(product.get().getiDProduct())){
            amount = product.get().getPrice();
            quantity = cart.getQuantity();
            for (Cart cart1 : carts){
              total += cart1.getAmount();
            }
            model.addAttribute("product", carts);
            model.addAttribute("quantity", quantity);
            model.addAttribute("amount", amount);
            model.addAttribute("total", total);
            return "cart";
          }
        }
      }
    }
    model.addAttribute("product", carts);
    total = 0;
    for (Cart cart: carts){
      total += cart.getAmount();
    }
    model.addAttribute("total", total);
    return "cart";
  }

  @GetMapping(path = "/invoice/{iDProduct}")
    public String invoice(@PathVariable("iDProduct") Integer iDProduct, Model model){
    if(iDProduct != null){
      Optional<Product> product = productRepository.findOneByiDProduct(iDProduct);
      if (product.isPresent()){
        carts.add(new Cart(product.get()));
        total = 0;
        quantity = 0;

        for (Cart cart2: carts){
          amount = product.get().getPrice();
          quantity = cart2.getQuantity();
          total += cart2.getAmount()/2;
        }
        model.addAttribute("product", carts);
        model.addAttribute("quantity", quantity);
        model.addAttribute("amount", amount);
        model.addAttribute("total", total);
        return "invoice";
      }
    }
    return "invoice";
  }

//  @GetMapping(path = "/cart/add/{iDProduct}")
//  public String add(@PathVariable("iDProduct") Integer iDProduct, Model model){
//    Optional<Product> product = productRepository.findOneByiDProduct(iDProduct);
//    if(product.isPresent()){
//      total = 0;
//      quantity = 0;
//      amount = product.get().getPrice();
//
//      model.addAttribute("product", carts);
//      for (Cart cart : carts){
//        quantity =+ cart.getQuantity();
//        total += cart.getAmount();
//      }
//      model.addAttribute("total", total);
//      model.addAttribute("amount", amount);
//      model.addAttribute("quantity", quantity);
//    }
//    return "cart";
//  }
//
//  @GetMapping(path = "/cart/subtract/{iDProduct}")
//  public String subtract(@PathVariable("iDProduct") Integer iDProduct, Model model){
//    Optional<Product> product = productRepository.findOneByiDProduct(iDProduct);
//    if(product.isPresent()){
//      total = 0;
//      quantity = 0;
//      amount = product.get().getPrice();
//      model.addAttribute("product", carts);
//      for (Cart cart : carts){
//        quantity =- cart.getQuantity();
//        total -= cart.getAmount();
//      }
//      model.addAttribute("total", total);
//      model.addAttribute("amount", amount);
//      model.addAttribute("quantity", quantity);
//    }
//    return "cart";
//  }
}