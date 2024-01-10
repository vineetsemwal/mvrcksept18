package com.maveric.securitydemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/success")
    public String successLogin(){
      return "login successful";
    }

}
