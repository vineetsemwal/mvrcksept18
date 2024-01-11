package com.maveric.ecommerce.productms.service;


import com.maveric.ecommerce.productms.dtos.AddProduct;
import com.maveric.ecommerce.productms.dtos.ProductDetails;
import com.maveric.ecommerce.productms.exceptions.ProductNotFoundException;

public interface IProductService {

    ProductDetails add(AddProduct requestData);

    ProductDetails findById(long id)throws ProductNotFoundException;
}
