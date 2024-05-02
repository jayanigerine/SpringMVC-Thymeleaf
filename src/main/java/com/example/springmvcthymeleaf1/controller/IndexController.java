package com.example.springmvcthymeleaf1.controller;

import com.example.springmvcthymeleaf1.Repository.UserRepo;
import com.example.springmvcthymeleaf1.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
    @Autowired
    private UserRepo userRepo;
    @GetMapping("/")
    public String indexPage(Model model){
        model.addAttribute("userForm",new Users());
        return "index";
    }
    @PostMapping("/register")
    public String registerUser(@ModelAttribute Users users, Model model){
        System.out.println(users.toString());
        Users usersAdded = userRepo.save(users);
        System.out.println(users.toString());
        model.addAttribute("message",usersAdded.getFirstName()+ usersAdded.getLastName()+"is registered successfully");
        return "welcome" ;


    }











}
