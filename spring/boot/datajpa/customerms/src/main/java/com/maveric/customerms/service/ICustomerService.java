package com.maveric.customerms.service;

import com.maveric.customerms.domain.Customer;
import com.maveric.customerms.exceptions.CustomerNotFoundException;
import com.maveric.customerms.exceptions.InvalidCustomerNameException;
import com.maveric.customerms.exceptions.InvalidIDException;

import java.util.List;

public interface ICustomerService {

   Customer register(String name) throws InvalidCustomerNameException;
   Customer findById(long id) throws CustomerNotFoundException, InvalidIDException;

   List<Customer>findCustomersByName(String name);

}
