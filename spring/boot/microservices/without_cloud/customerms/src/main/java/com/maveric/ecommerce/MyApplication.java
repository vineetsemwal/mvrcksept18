package com.maveric.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/*
@Configuration
@ComponentScan
@AutoConfiguration
 */
@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyApplication.class, args);
    }


    /**
     *
     * for handling cross origin requests
     */

    @Bean
    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource src=new UrlBasedCorsConfigurationSource();
        CorsConfiguration configuration=new CorsConfiguration();
        configuration.setAllowCredentials(true);
        configuration.addAllowedHeader("*");
        configuration.addAllowedOrigin("http://localhost:3000");
        configuration.addAllowedMethod("*");
        src.registerCorsConfiguration("/**",configuration);
        return new CorsFilter(src);
    }

/*

    @Bean
    SpringDocConfiguration springDocConfiguration(){
        return new SpringDocConfiguration();
    }

    @Bean
    SpringDocConfigProperties springDocConfigProperties() {
        return new SpringDocConfigProperties();
    }

    @Bean
    ObjectMapperProvider objectMapperProvider(SpringDocConfigProperties springDocConfigProperties){
        return new ObjectMapperProvider(springDocConfigProperties);
    }

    @Bean
    SpringDocUIConfiguration SpringDocUIConfiguration(Optional<SwaggerUiConfigProperties> optionalSwaggerUiConfigProperties){
        return new SpringDocUIConfiguration(optionalSwaggerUiConfigProperties);
    }
    */


}

