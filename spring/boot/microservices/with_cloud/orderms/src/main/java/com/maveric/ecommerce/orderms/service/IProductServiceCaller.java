package com.maveric.ecommerce.orderms.service;


import com.maveric.ecommerce.orderms.dtos.ProductDetailsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("/products")
public interface IProductServiceCaller {

    @GetMapping("{}")
    ProductDetailsDTO fetchById(@PathVariable  long id);

}
