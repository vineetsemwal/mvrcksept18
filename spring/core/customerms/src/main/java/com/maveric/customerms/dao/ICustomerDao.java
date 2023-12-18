package com.maveric.customerms.dao;

import com.maveric.customerms.domain.Customer;

public interface ICustomerDao {
    Customer save(Customer customer);
}
