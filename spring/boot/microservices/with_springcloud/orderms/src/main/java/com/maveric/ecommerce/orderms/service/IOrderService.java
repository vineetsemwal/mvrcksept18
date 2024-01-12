package com.maveric.ecommerce.orderms.service;

import com.maveric.ecommerce.orderms.dtos.CreateOrderRequest;
import com.maveric.ecommerce.orderms.dtos.OrderDetails;
import com.maveric.ecommerce.orderms.exceptions.CustomerNotFoundException;
import com.maveric.ecommerce.orderms.exceptions.OrderNotFoundException;
import com.maveric.ecommerce.orderms.exceptions.ProductNotFoundException;

import java.util.List;

public interface IOrderService {

   OrderDetails createOrder(CreateOrderRequest request) throws ProductNotFoundException, CustomerNotFoundException, ProductNotFoundException, CustomerNotFoundException;

   OrderDetails findById(long orderId) throws OrderNotFoundException, ProductNotFoundException, CustomerNotFoundException;

   //List<OrderDetails> findByCustomerId(long customerId) throws CustomerNotFoundException;



}
