package com.maveric.customerms.dao;

import com.maveric.customerms.domain.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CustomerDaoImpl implements ICustomerDao{
    private Map<Long,Customer>store= new HashMap<>();

    @Override
    public Customer save(Customer customer) {
        store.put(customer.getId(),customer);
        return customer;
    }
}
