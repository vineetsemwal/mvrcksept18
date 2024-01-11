package com.maveric.securitydemo.controllers;

import com.maveric.securitydemo.dto.CreateCustomerRequest;
import com.maveric.securitydemo.dto.CustomerResponse;
import com.maveric.securitydemo.service.ICustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CustomerController {
    private ICustomerService service;

    public CustomerController(ICustomerService service) {
        this.service = service;
    }

    /*
    You can return responseentity which contains (response,status,headers)
     */
    @GetMapping("/c/customers/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable long id)throws Exception{
        CustomerResponse response= service.findById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    /*

    @GetMapping("/{id}")
    public CustomerResponse findById(@PathVariable long id)throws Exception{
       CustomerResponse response= service.findById(id);
       return response;
    }*/


    @PostMapping("/p/customers")
    public CustomerResponse register(@RequestBody  CreateCustomerRequest request)throws Exception{
       CustomerResponse response =service.register(request);
       return response;
    }

    @GetMapping("/a/customers/all")
    public List<CustomerResponse>fetchAll(){
        return service.findAllCustomers();
    }




}
