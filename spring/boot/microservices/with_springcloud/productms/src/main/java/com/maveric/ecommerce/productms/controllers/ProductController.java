package com.maveric.ecommerce.productms.controllers;

import com.maveric.ecommerce.productms.dtos.AddProduct;
import com.maveric.ecommerce.productms.dtos.ProductDetails;
import com.maveric.ecommerce.productms.service.IProductService;
import com.maveric.ecommerce.productms.service.ProductServiceImpl;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/products")
@RestController
public class ProductController {
    private IProductService service;
    public ProductController(IProductService service){
        this.service=service;
    }

    @PostMapping
    public ProductDetails add(@RequestBody AddProduct request)throws Throwable{
        return service.add(request);
    }

    @GetMapping("/{id}")
    public ProductDetails fetchProduct(@PathVariable long id)throws Throwable{
        return service.findById(id);
    }


}
