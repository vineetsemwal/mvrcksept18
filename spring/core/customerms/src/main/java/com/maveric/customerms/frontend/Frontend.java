package com.maveric.customerms.frontend;

import com.maveric.customerms.JavaConfig;
import com.maveric.customerms.domain.Customer;
import com.maveric.customerms.service.CustomerServiceImpl;
import com.maveric.customerms.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Frontend {

    @Autowired
    ICustomerService service;


    public String registerAndDisplay(String name) {
        Customer customer = service.register(name);
        String text = "Customer-" + customer.getId() + "-" + customer.getName();
        return text;
    }

}

