package com.maveric.didemo;

import com.maveric.didemo.beans.Square;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.maveric.didemo")
@Configuration
public class JavaConfig {

    @Bean
    public Square square(){
        return new Square(6);
    }

}
