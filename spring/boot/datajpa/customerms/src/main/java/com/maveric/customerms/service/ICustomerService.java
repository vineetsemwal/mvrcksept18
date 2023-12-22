package com.maveric.customerms.service;

import com.maveric.customerms.domain.Customer;
import com.maveric.customerms.dto.CreateCustomerRequest;
import com.maveric.customerms.dto.CustomerResponse;
import com.maveric.customerms.exceptions.CustomerNotFoundException;
import com.maveric.customerms.exceptions.InvalidCustomerNameException;
import com.maveric.customerms.exceptions.InvalidIDException;

import java.util.List;

public interface ICustomerService {

   CustomerResponse register(CreateCustomerRequest requestData) throws InvalidCustomerNameException;
   CustomerResponse findById(long id) throws CustomerNotFoundException, InvalidIDException;

   List<CustomerResponse>findCustomersByName(String name);

}
