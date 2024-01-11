package com.maveric.securitydemo.controllers;

import com.maveric.securitydemo.dto.LoginRequest;
import com.maveric.securitydemo.service.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    private IUserService userService;

    public AppController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/success")
    public String successLogin() {
        return "login successful";
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest requestData) {
        String token = userService.login(requestData.getUsername(), requestData.getPassword());
      return ResponseEntity.ok()
               .header("Authorization",token)
               .body("you are successfully logged in");

    }

}
