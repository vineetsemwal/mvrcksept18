package com.maveric.customerms.service;

import com.maveric.customerms.domain.Customer;
import com.maveric.customerms.dto.CreateCustomerRequest;
import com.maveric.customerms.dto.CustomerResponse;
import com.maveric.customerms.exceptions.CustomerNotFoundException;
import com.maveric.customerms.exceptions.InvalidCustomerNameException;
import com.maveric.customerms.exceptions.InvalidIDException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
public interface ICustomerService {

   CustomerResponse register(@Valid CreateCustomerRequest requestData) throws InvalidCustomerNameException;
   CustomerResponse findById(@Min(1) long id) throws CustomerNotFoundException, InvalidIDException;

   List<CustomerResponse>findCustomersByName(@NotBlank @Length(min = 2,max=20) String name);

}
