package com.maveric.ecommerce.customerms.controllers;

import com.maveric.ecommerce.customerms.dto.CreateCustomerRequest;
import com.maveric.ecommerce.customerms.dto.CustomerResponse;
import com.maveric.ecommerce.customerms.service.ICustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/customers")
@RestController
public class CustomerController {
    private ICustomerService service;

    public CustomerController(ICustomerService service) {
        this.service = service;
    }

    /*
    You can return responseentity which contains (response,status,headers)
     */
    @GetMapping("/{id}")
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
    @PostMapping
    public CustomerResponse register(@RequestBody  CreateCustomerRequest request)throws Exception{
       CustomerResponse response =service.register(request);
       return response;
    }




}
