package com.maveric.customerms;

import com.maveric.customerms.frontend.Frontend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/*
@Configuration
@ComponentScan
@AutoConfiguration
 */
@SpringBootApplication
public class MyApplication {



    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(MyApplication.class,args);
        Frontend frontend = context.getBean(Frontend.class);
        frontend.registerAndDisplay("rahul");
        frontend.registerAndDisplay("govind");
    }



}

