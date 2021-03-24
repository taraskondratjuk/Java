package com.example.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
      public String homePage(){
        return "HOME PAGE";
    }

    @GetMapping("/ceo")
    public String ceoPage(){
        return "CEO PAGE";
    }

    @GetMapping("/user")
    public String userPage(){
        return "USER PAGE";
    }

    @GetMapping("/hr")
    public String hrPage(){
        return "HR PAGE";
    }

    @GetMapping("/admin")
    public String adminPage(){
        return "ADMIN PAGE";
    }

}
