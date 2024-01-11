package com.maveric.ecommerce.orderms.utils;

import com.maveric.ecommerce.customerms.domain.Customer;
import com.maveric.ecommerce.orderms.dtos.OrderDetails;
import com.maveric.ecommerce.orderms.entities.CreatedOrder;
import com.maveric.ecommerce.productms.dtos.ProductDetails;
import com.maveric.ecommerce.productms.entities.Product;
import com.maveric.ecommerce.productms.utils.ProductUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OrderUtil {

    private ProductUtil productUtil;

    public OrderUtil(ProductUtil util) {
        this.productUtil = util;
    }

    public OrderDetails toOrderDetails(CreatedOrder order) {
        Product product = order.getProduct();
        Customer customer = order.getCustomer();
        OrderDetails orderDetails = new OrderDetails();
        BeanUtils.copyProperties(order, orderDetails);
        orderDetails.setProductId(product.getId());
        orderDetails.setProductName(product.getName());
        orderDetails.setCustomerId(customer.getId());
        orderDetails.setCustomerName(customer.getName());
        return orderDetails;
    }
}
