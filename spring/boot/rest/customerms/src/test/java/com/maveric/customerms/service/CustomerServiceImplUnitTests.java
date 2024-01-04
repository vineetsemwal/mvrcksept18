package com.maveric.customerms.service;

import com.maveric.customerms.dao.ICustomerDao;
import com.maveric.customerms.domain.Customer;
import com.maveric.customerms.dto.CreateCustomerRequest;
import com.maveric.customerms.dto.CustomerResponse;
import com.maveric.customerms.exceptions.CustomerNotFoundException;
import com.maveric.customerms.util.CustomerUtil;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class CustomerServiceImplUnitTests {

    @Mock
    ICustomerDao dao;
    @Mock
    CustomerUtil util;
    @InjectMocks
    @Spy
    CustomerServiceImpl service;

    /*
     scenario: customer registered successfully
     */
    @Test
    void register_CustomerRegisteredSuccess() throws Throwable {
        CreateCustomerRequest request = mock(CreateCustomerRequest.class);
        Customer customer = mock(Customer.class);
        CustomerResponse response = mock(CustomerResponse.class);
        when(util.from(request)).thenReturn(customer);
        Customer saved = mock(Customer.class);
        when(dao.save(customer)).thenReturn(saved);
        when(util.from(saved)).thenReturn(response);
        CustomerResponse result = service.register(request);
        assertSame(response, result);
        verify(dao).save(customer);
    }

    /*
    Scenario: user fetched successfully
     */
    @Test
    void findById_Success() throws Throwable{
        long customerId = 34;
        Customer customer = mock(Customer.class);
        Optional<Customer> optional = Optional.of(customer);
        CustomerResponse response = mock(CustomerResponse.class);
        when(dao.findById(customerId)).thenReturn(optional);
        when(util.from(customer)).thenReturn(response);
        CustomerResponse result =service.findById(customerId);
        assertSame(response,result);
        verify(service).findById(customerId);
    }

    /*
     Scenario : Customer not found
     verifying CustomerNotFoundExcepotion is thrown
     */
    @Test
    void findById_UserNotFound() {
        long customerId=10;
        Optional<Customer>optional=Optional.empty();
        when(dao.findById(customerId)).thenReturn(optional);
        Executable executable=()->{
            service.findById(customerId);
        };
        assertThrows(CustomerNotFoundException.class,executable);
    }
}