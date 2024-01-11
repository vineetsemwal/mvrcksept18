package com.maveric.ecommerce.orderms.service;

import com.maveric.ecommerce.customerms.dao.ICustomerDao;
import com.maveric.ecommerce.customerms.domain.Customer;
import com.maveric.ecommerce.customerms.exceptions.CustomerNotFoundException;
import com.maveric.ecommerce.orderms.dtos.CreateOrderRequest;
import com.maveric.ecommerce.orderms.dtos.OrderDetails;
import com.maveric.ecommerce.orderms.entities.CreatedOrder;
import com.maveric.ecommerce.orderms.exceptions.OrderNotFoundException;
import com.maveric.ecommerce.orderms.repo.IOrderRepository;
import com.maveric.ecommerce.orderms.utils.OrderUtil;
import com.maveric.ecommerce.productms.entities.Product;
import com.maveric.ecommerce.productms.exceptions.ProductNotFoundException;
import com.maveric.ecommerce.productms.repo.IProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements IOrderService{

    private IOrderRepository orderRepo;
    private OrderUtil orderUtil;
    private IProductRepo productRepo;
    private ICustomerDao customerRepo;
    public OrderServiceImpl(IOrderRepository orderRepo, ICustomerDao customerRepo, IProductRepo productRepo, OrderUtil util ){
        this.orderRepo =orderRepo;
        this.orderUtil=util;
        this.productRepo=productRepo;
        this.customerRepo=customerRepo;

    }

    @Override
    public OrderDetails createOrder(CreateOrderRequest request) throws ProductNotFoundException, CustomerNotFoundException {
        Optional<Product>productOptional=productRepo.findById(request.getProductId());
        if(productOptional.isEmpty()){
         throw new ProductNotFoundException("product not found");
        }
        Product product=productOptional.get();
        Optional<Customer>customerOptional=customerRepo.findById(request.getCustomerId());
        if(customerOptional.isEmpty()){
            throw new CustomerNotFoundException("customer not found");
        }
        Customer customer=customerOptional.get();
        CreatedOrder order=new CreatedOrder();
        order.setUnits(request.getUnits());
        double orderPrice= request.getUnits()* product.getPrice();
        order.setCustomer(customer);
        order.setProduct(product);
        order.setOrderPrice(orderPrice);
        order.setProductPrice(product.getPrice());
        order=orderRepo.save(order);
        return orderUtil.toOrderDetails(order);
    }

    @Override
    public OrderDetails findById(long orderId) throws OrderNotFoundException {
        Optional<CreatedOrder> optional=orderRepo.findById(orderId);
        if (optional.isEmpty()){
            throw new OrderNotFoundException("order not found");
        }
        CreatedOrder order=optional.get();
        return orderUtil.toOrderDetails(order);

    }

    @Override
    public List<OrderDetails> findByCustomerId(long customerId) throws CustomerNotFoundException {
        Optional<Customer>customerOptional=customerRepo.findById(customerId);
        if(customerOptional.isEmpty()){
            throw new CustomerNotFoundException("customer not found");
        }
        Customer customer=customerOptional.get();

        List<CreatedOrder>orders=orderRepo.findByCustomer(customer);
        return orders.stream().map(order->orderUtil.toOrderDetails(order))
                .toList();
    }
}
