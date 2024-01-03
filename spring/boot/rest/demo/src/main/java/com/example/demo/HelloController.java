package com.example.demo;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@Slf4j
@RequestMapping("/customers")
@RestController
public class HelloController {

    private Map<Long,Customer>store=new HashMap<>();


    private long generatedId=2;

    public HelloController(){
        store.put(1l,new Customer(1l,"ajay",21));
        store.put(2l,new Customer(2l,"kushal",21));
    }
    public long generateId(){
        return ++generatedId;
    }


    /**
     *  /customers/1
     */
    @GetMapping("/{id}")
    public Customer findCustomerById(@PathVariable  long id){
        log.info("store="+store);
        System.out.println("***inside findCustomerById id="+id);
       Customer customer= store.get(id);
        log.info("custromer fetched="+customer.getName());
       return customer;
    }


/*
     /customers
 */
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Customer create(@Valid @RequestBody Customer customer){
        ObjectMa
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
