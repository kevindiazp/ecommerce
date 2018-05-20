//package com.ecommercesystem.ecommerce.controllers;
//
//import com.ecommercesystem.ecommerce.entities.User;
//import com.ecommercesystem.ecommerce.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class UserController {
//
//  @Autowired
//  UserRepository userRepository;

//  @GetMapping(path = "/login")
//  public String login(){
//    return "login";
//  }

//  @PostMapping(path = "/login")
//  public String sign_Up(Integer id, @RequestParam( value = "userName") String userName, @RequestParam(value = "emailAddress") String emailAddress, @RequestParam(value = "passWord") String passWord, Model model){
//    User users = new User(id,userName, emailAddress, passWord);
//    users.setUserName(userName);
//    users.setEmailAddress(emailAddress);
//    users.setPassWord(passWord);
//    userRepository.save(users);
////    if (userName.equals(userName) && passWord.equals(passWord)){
////      return "";
////    }
//    return "login";
//  }
  //Gunakan Spring security
//}