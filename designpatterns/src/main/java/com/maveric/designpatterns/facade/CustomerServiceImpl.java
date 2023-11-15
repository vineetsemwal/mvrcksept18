package com.maveric.designpatterns.facade;

import java.util.HashMap;
import java.util.Map;

public class CustomerServiceImpl implements ICustomerService {
    private Map<Long, Customer> store = new HashMap<>();

    private long id;

    public CustomerServiceImpl(){
        store.put(1l,new Customer(1,"archana"));
        store.put(2l,new Customer(2,"ajay"));
    }

    private long generateId() {
        return ++id;
    }


    @Override
    public Customer register(String name) {
        long newId = generateId();
        Customer customer = new Customer(newId, name);
        store.put(newId,customer);
        return customer;
    }

    @Override
    public Customer findById(long id) {
        return store.get(id);
    }

    @Override
    public Customer update(Customer customer) {
        store.replace(customer.getId(), customer);
        return customer;
    }
}
