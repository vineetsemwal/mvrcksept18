package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {


    private Map<Long,Customer>store=new HashMap<>();


    private long generatedId=2;

    public HelloController(){
        store.put(1l,new Customer(1,"ajay",21));
        store.put(2l,new Customer(2,"kushal",21));
    }
    public long generateId(){
        return ++generatedId;
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

    @PostMapping("/customers/add")
    public Customer create(@RequestBody Customer customer){
       long newId= generateId();
       customer.setId(newId);
       store.put(newId,customer);
       return customer;
    }

}
