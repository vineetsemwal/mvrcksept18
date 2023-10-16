package com.maveric.customerms.dao;

import com.maveric.customerms.domain.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerDaoImpl implements ICustomerDao{
    private Map<Long,Customer>store= new HashMap<>();

    @Override
    public Customer save(Customer customer) {
        store.put(customer.getId(),customer);
        return customer;
    }
}
