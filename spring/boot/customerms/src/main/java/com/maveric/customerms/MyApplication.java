package com.maveric.customerms;

import com.maveric.customerms.frontend.Frontend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
/*
1) @ComponentScan
2)@Configuration
3) @AutoConfiguration
 */

@SpringBootApplication
public class MyApplication {


    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(MyApplication.class,args);
        Frontend frontend = context.getBean(Frontend.class);
        String result1 = frontend.registerAndDisplay("rahul");
        System.out.println(result1);
        String result2 = frontend.registerAndDisplay("govind");
        System.out.println(result2);
    }



}

