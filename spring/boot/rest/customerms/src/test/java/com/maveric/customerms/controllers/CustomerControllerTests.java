package com.maveric.customerms.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.maveric.customerms.dto.CustomerResponse;
import com.maveric.customerms.exceptions.CustomerNotFoundException;
import com.maveric.customerms.service.CustomerServiceImpl;
import com.maveric.customerms.service.ICustomerService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(CustomerController.class)
class CustomerControllerTests {

    @MockBean
    ICustomerService service;

    @Autowired
    MockMvc mvc;

    /**
     * Scenario: Customer found and response is returned
     */
    @Test
    void findById_Success() throws Throwable {
        CustomerResponse response = new CustomerResponse();
        response.setCustomerId(1);
        response.setAccountId(10);
        response.setName("sampath");
        response.setAge(24);
        when(service.findById(1)).thenReturn(response);
        ObjectMapper mapper = new ObjectMapper();
        String expectedJson = mapper.writeValueAsString(response);
        System.out.println("expectedjson=" + expectedJson);
        String uri = "/customers/1";
        mvc.perform(get(uri)).andExpect(status().isOk()).andExpect(content().json(expectedJson));
        verify(service).findById(1);

    }

    /**
     * Scenario: Customer found and response is returned
     */
    @Test
    void findById_Failure() throws Throwable {
        String expectedResponse = "customer not found";
        String uri = "/customers/100";
        CustomerNotFoundException exception = new CustomerNotFoundException(expectedResponse);
        doThrow(exception).when(service).findById(100);
        mvc.perform(get(uri)).andExpect(status().isBadRequest()).andExpect(content().string(expectedResponse));
        verify(service).findById(100);
    }

}