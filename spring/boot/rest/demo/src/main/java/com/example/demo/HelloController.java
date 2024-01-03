package com.example.demo;

import jakarta.validation.Valid;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RequestMapping("/customers")
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


    /**
     *  /customers/1
     */
    @GetMapping("/{id}")
    public Customer findCustomerById(@PathVariable  long id){
        System.out.println("store="+store);
        System.out.println("***inside findCustomerById id="+id);
       Customer customer= store.get(id);
        System.out.println("custromer fetched="+customer.getName());
       return customer;
    }


/*
     /customers
 */
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Customer create(@Valid @RequestBody Customer customer){
       long newId= generateId();
       customer.setId(newId);
       store.put(newId,customer);
       return customer;
    }

    /*
     /customers
 */
    @PutMapping
    public Customer update(@RequestBody Customer customer){
        store.put(customer.getId(),customer);
        return customer;
    }

    /*
     /customers/1
 */
    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable long id){
        store.remove(id);
        return "customer removed";
    }




}
