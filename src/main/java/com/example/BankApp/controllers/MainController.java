package com.example.BankApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/hello")
    public String hello(){
        return "<h2>Hello!!</h2>";
    }

    @GetMapping("/user")
    public String user(){
        return "<h2>Hello, user!!</h2>";
    }

    @GetMapping("/admin")
    public String admin(){
        return "<h2>Hello, admin!!</h2>";
    }
}
