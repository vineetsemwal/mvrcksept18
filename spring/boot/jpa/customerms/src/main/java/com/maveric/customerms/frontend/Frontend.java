package com.maveric.customerms.frontend;

import com.maveric.customerms.domain.Customer;
import com.maveric.customerms.exceptions.InvalidCustomerNameException;
import com.maveric.customerms.service.ICustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Frontend {
 private static  final Logger Log= LoggerFactory.getLogger(Frontend.class);
    @Autowired
    ICustomerService service;


    public void registerAndDisplay(String name) {
        try {
            Customer customer = service.register(name);
            String text = "Customer-" + customer.getId() + "-" + customer.getName();
            Log.info("register and display="+text);
        }catch (InvalidCustomerNameException e){
            Log.error("invalid customer name",e);
        }
    }

}

