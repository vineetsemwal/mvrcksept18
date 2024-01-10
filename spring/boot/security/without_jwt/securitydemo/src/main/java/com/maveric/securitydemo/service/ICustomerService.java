package com.maveric.securitydemo.service;

import com.maveric.securitydemo.dto.CreateCustomerRequest;
import com.maveric.securitydemo.dto.CustomerResponse;
import com.maveric.securitydemo.exceptions.CustomerNotFoundException;
import com.maveric.securitydemo.exceptions.InvalidCustomerNameException;
import com.maveric.securitydemo.exceptions.InvalidIDException;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.*;
import javax.validation.constraints.*;
import java.util.List;

@Validated
public interface ICustomerService {

   CustomerResponse register(@Valid CreateCustomerRequest requestData) throws InvalidCustomerNameException;
   CustomerResponse findById(@Min(1) long id) throws CustomerNotFoundException, InvalidIDException;

   List<CustomerResponse>findCustomersByName(@NotBlank @Length(min = 2,max=20) String name);

   List<CustomerResponse>findAllCustomers();

}
