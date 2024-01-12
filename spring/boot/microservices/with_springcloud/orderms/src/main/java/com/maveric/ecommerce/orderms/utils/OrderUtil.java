package com.maveric.ecommerce.orderms.utils;

import com.maveric.ecommerce.orderms.dtos.CustomerResponse;
import com.maveric.ecommerce.orderms.dtos.OrderDetails;
import com.maveric.ecommerce.orderms.dtos.ProductDetailsDTO;
import com.maveric.ecommerce.orderms.entities.CreatedOrder;
import com.maveric.ecommerce.orderms.exceptions.CustomerNotFoundException;
import com.maveric.ecommerce.orderms.exceptions.ProductNotFoundException;
import com.maveric.ecommerce.orderms.service.ICustomerServiceApiUse;
import com.maveric.ecommerce.orderms.service.IProductServiceApIUse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OrderUtil {

    @Value("${customerms.url}")
    private String baseCustomerUrl;
    @Value("${productms.url}")
    private String baseProductUrl;

    private RestTemplate restTemplate;
    private IProductServiceApIUse productApi;
    private ICustomerServiceApiUse customerApi;

    public OrderUtil(RestTemplate restTemplate, IProductServiceApIUse productApi, ICustomerServiceApiUse customerApi) {
        this.restTemplate = restTemplate;
        this.productApi=productApi;
        this.customerApi=customerApi;
    }

    public OrderDetails toOrderDetails(CreatedOrder order,ProductDetailsDTO product, CustomerResponse customer) {
        OrderDetails orderDetails = new OrderDetails();
        BeanUtils.copyProperties(order, orderDetails);
        orderDetails.setProductId(order.getProductId());
        orderDetails.setProductName(product.getName());
        orderDetails.setCustomerId(order.getCustomerId());
        orderDetails.setCustomerName(customer.getName());
        orderDetails.setCustomerId(customer.getCustomerId());
        return orderDetails;
    }

    public ProductDetailsDTO fetchByProductId(long productId) throws ProductNotFoundException {
        try {
          //  String fetchProductUrl = baseProductUrl + "/" + productId;
        //    ProductDetailsDTO desired = restTemplate.getForObject(fetchProductUrl, ProductDetailsDTO.class);
            ProductDetailsDTO desired=productApi.fetchProductById(productId);
            return desired;
        }catch (Exception cause){
            throw new ProductNotFoundException("product not found",cause);
        }
    }

    public CustomerResponse fetchCustomerById(long customerId) throws CustomerNotFoundException {
        try {
         //   String fetchCustomerUrl = baseCustomerUrl + "/" + customerId;
         //   CustomerResponse desired = restTemplate.getForObject(fetchCustomerUrl, CustomerResponse.class);
           CustomerResponse desired=customerApi.findById(customerId);
            return desired;
        }catch (Exception cause){
            throw new CustomerNotFoundException("customer not found",cause);
        }
    }


}
