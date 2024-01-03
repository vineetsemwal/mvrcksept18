package com.maveric.customerms;

import com.maveric.customerms.frontend.Frontend;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
/*
1) @ComponentScan
2)@Configuration
3) @AutoConfiguration
 */

@SpringBootApplication
public class MyApplication {

    private static  final Logger Log= LoggerFactory.getLogger(MyApplication.class);


    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(MyApplication.class,args);
        Frontend frontend = context.getBean(Frontend.class);
        String result1 = frontend.registerAndDisplay("rahul");
        Log.info(result1);
        String result2 = frontend.registerAndDisplay("govind");
        Log.info(result2);
    }



}

