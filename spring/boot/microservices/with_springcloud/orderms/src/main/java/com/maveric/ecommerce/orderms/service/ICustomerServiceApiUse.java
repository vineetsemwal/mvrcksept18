package com.maveric.ecommerce.orderms.service;

import com.maveric.ecommerce.orderms.dtos.CustomerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("customerms")
public interface ICustomerServiceApiUse {

    @GetMapping("/customers/{id}")
    CustomerResponse findById(@PathVariable long id)throws Exception;

    }
