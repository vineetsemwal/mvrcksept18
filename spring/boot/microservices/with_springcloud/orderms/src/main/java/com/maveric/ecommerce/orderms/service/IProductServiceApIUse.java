package com.maveric.ecommerce.orderms.service;

import com.maveric.ecommerce.orderms.dtos.ProductDetailsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("productms")
public interface IProductServiceApIUse {

 @GetMapping("/products/{id}")
 ProductDetailsDTO fetchProductById(@PathVariable long id);

}
