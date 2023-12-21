package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {


    private Map<Long,Customer>store=new HashMap<>();

    public HelloController(){
        store.put(1l,new Customer(1,"ajay",21));
        store.put(2l,new Customer(2,"kushal",21));
    }

    @GetMapping("/greet")
    public String greetUser(){
        return "welcome to REST";
    }


    /**
     *  /users/1
     */
    @GetMapping("/customers/{id}")
    public Customer findCustomerById(@PathVariable  long id){
        System.out.println("store="+store);
        System.out.println("***inside findCustomerById id="+id);
       Customer customer= store.get(id);
        System.out.println("custromer fetched="+customer.getName());
       return customer;
    }


}
