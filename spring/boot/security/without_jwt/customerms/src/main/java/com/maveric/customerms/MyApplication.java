package com.maveric.customerms;

import com.maveric.customerms.dto.RegisterAdminRequest;
import com.maveric.customerms.service.IAdminService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
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
        ApplicationContext context=SpringApplication.run(MyApplication.class,args);
        IAdminService adminService= context.getBean(IAdminService.class);
        RegisterAdminRequest request=new RegisterAdminRequest();
        request.setPassword("1234");
        request.setUsername("sampath");
        adminService.register(request);

    }
    /**
     *
     * for handling cross origin requests
     */
/*
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
*/

}

