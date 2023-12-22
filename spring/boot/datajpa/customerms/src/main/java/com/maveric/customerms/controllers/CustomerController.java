package com.maveric.customerms.controllers;

import com.maveric.customerms.domain.Customer;
import com.maveric.customerms.dto.CreateCustomerRequest;
import com.maveric.customerms.dto.CustomerResponse;
import com.maveric.customerms.service.ICustomerService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/customers")
@RestController
public class CustomerController {
    private ICustomerService service;

    public CustomerController(ICustomerService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public CustomerResponse findById(@PathVariable long id)throws Exception{
       CustomerResponse response= service.findById(id);
       return response;
    }
    @PostMapping
    public CustomerResponse register(@RequestBody CreateCustomerRequest request)throws Exception{
       CustomerResponse response =service.register(request);
       return response;
    }




}
