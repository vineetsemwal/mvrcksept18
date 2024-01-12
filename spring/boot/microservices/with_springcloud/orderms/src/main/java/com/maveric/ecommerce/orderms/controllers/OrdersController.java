package com.maveric.ecommerce.orderms.controllers;

import com.maveric.ecommerce.orderms.dtos.CreateOrderRequest;
import com.maveric.ecommerce.orderms.dtos.OrderDetails;
import com.maveric.ecommerce.orderms.service.IOrderService;
import com.maveric.ecommerce.orderms.service.OrderServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    private IOrderService service;
    public OrdersController(IOrderService service){
        this.service=service;
    }

    @PostMapping
    public OrderDetails createOrder(@RequestBody CreateOrderRequest request)throws Throwable{
        return service.createOrder(request);
    }

    @GetMapping("{orderId}")
    public OrderDetails findOrderById(@PathVariable long orderId)throws Throwable{
       return service.findById(orderId);
    }

    /*
    @GetMapping("/by/customer/{customerId}")
    public List<OrderDetails>findByCustomerId(@PathVariable long customerId)throws Throwable{
        return service.findByCustomerId(customerId);
    }
*/

}
