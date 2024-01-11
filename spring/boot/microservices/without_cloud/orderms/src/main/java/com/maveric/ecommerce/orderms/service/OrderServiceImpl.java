package com.maveric.ecommerce.orderms.service;

import com.maveric.ecommerce.orderms.dtos.CreateOrderRequest;
import com.maveric.ecommerce.orderms.dtos.CustomerResponse;
import com.maveric.ecommerce.orderms.dtos.OrderDetails;
import com.maveric.ecommerce.orderms.dtos.ProductDetailsDTO;
import com.maveric.ecommerce.orderms.entities.CreatedOrder;
import com.maveric.ecommerce.orderms.exceptions.CustomerNotFoundException;
import com.maveric.ecommerce.orderms.exceptions.OrderNotFoundException;
import com.maveric.ecommerce.orderms.exceptions.ProductNotFoundException;
import com.maveric.ecommerce.orderms.repo.IOrderRepository;
import com.maveric.ecommerce.orderms.utils.OrderUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements IOrderService {

    private IOrderRepository orderRepo;
    private OrderUtil orderUtil;

    public OrderServiceImpl(IOrderRepository orderRepo, OrderUtil util) {
        this.orderRepo = orderRepo;
        this.orderUtil = util;

    }

    @Override

    public OrderDetails createOrder(CreateOrderRequest request) throws ProductNotFoundException, CustomerNotFoundException {
        ProductDetailsDTO product = orderUtil.fetchByProductId(request.getProductId());
       CustomerResponse customer= orderUtil.fetchCustomerById(request.getCustomerId());
        CreatedOrder order = new CreatedOrder();
        order.setUnits(request.getUnits());
        double orderPrice = request.getUnits() * product.getPrice();
        order.setCustomerId(request.getCustomerId());
        order.setProductId(request.getProductId());
        order.setOrderPrice(orderPrice);
        order.setProductPrice(product.getPrice());
        order = orderRepo.save(order);
        return orderUtil.toOrderDetails(order,product,customer);
    }

    @Override
    public OrderDetails findById(long orderId) throws OrderNotFoundException, ProductNotFoundException, CustomerNotFoundException {
        Optional<CreatedOrder> optional = orderRepo.findById(orderId);
        if (optional.isEmpty()) {
            throw new OrderNotFoundException("order not found");
        }
        CreatedOrder order = optional.get();
        ProductDetailsDTO product = orderUtil.fetchByProductId(order.getProductId());
        CustomerResponse customer= orderUtil.fetchCustomerById(order.getCustomerId());
        return orderUtil.toOrderDetails(order,product,customer);

    }
/*
    @Override
    public List<OrderDetails> findByCustomerId(long customerId) throws CustomerNotFoundException {
        orderUtil.fetchCustomerById(customerId);
        List<CreatedOrder> orders = orderRepo.findByCustomerId(customerId);
        return orders.stream().map(order -> {
                    ProductDetailsDTO product = orderUtil.fetchByProductId(order.getProductId());
                    CustomerResponse customer= orderUtil.fetchCustomerById(order.getCustomerId());

                    orderUtil.toOrderDetails(order);

                })
                .toList();
    }
  */
}
