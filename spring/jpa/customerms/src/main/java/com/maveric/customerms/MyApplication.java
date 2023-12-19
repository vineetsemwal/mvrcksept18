package com.maveric.customerms;

import com.maveric.customerms.JavaConfig;
import com.maveric.customerms.domain.Customer;
import com.maveric.customerms.frontend.Frontend;
import com.maveric.customerms.service.CustomerServiceImpl;
import com.maveric.customerms.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyApplication {


    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        Frontend frontend = context.getBean(Frontend.class);
        String result1 = frontend.registerAndDisplay("rahul");
        System.out.println(result1);
        String result2 = frontend.registerAndDisplay("govind");
        System.out.println(result2);
    }



}

