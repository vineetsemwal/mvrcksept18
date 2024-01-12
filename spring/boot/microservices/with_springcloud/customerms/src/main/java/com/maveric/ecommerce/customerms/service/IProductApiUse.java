package com.maveric.ecommerce.customerms.service;

import com.maveric.ecommerce.customerms.dto.ProductDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("productms")
public interface IProductApiUse {

    @GetMapping("/products/cheapest")
    ProductDetails fetchCheapestProduct();

}
