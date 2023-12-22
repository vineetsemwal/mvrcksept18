package com.maveric.customerms.controllers;

import com.maveric.customerms.domain.Customer;
import com.maveric.customerms.dto.CreateCustomerRequest;
import com.maveric.customerms.dto.CustomerResponse;
import com.maveric.customerms.service.ICustomerService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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
