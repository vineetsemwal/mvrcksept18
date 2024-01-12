package com.maveric.ecommerce;

import com.maveric.ecommerce.customerms.dto.ProductDetails;
import com.maveric.ecommerce.customerms.util.CustomerUtil;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.time.Duration;

/*
@Configuration
@ComponentScan
@AutoConfiguration
 */
@EnableFeignClients
@SpringBootApplication
public class MyApplication {
/*
    @Bean
    public Customizer<Resilience4JCircuitBreakerFactory> defaultCustomizer() {
        TimeLimiterConfig timerConfig = TimeLimiterConfig
                .custom()
                .timeoutDuration(Duration.ofSeconds(2))
                .build();
        Customizer<Resilience4JCircuitBreakerFactory> customizer= factory-> factory.configureDefault(id -> new Resilience4JConfigBuilder(id)
                .timeLimiterConfig(timerConfig)
                //   .circuitBreakerConfig(CircuitBreakerConfig.ofDefaults())
                .build());
        return customizer;
    }
    */

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyApplication.class, args);
        CustomerUtil customerUtil= context.getBean(CustomerUtil.class);
        String result1= customerUtil.experiment();
        System.out.println("result1="+result1);
        String result2= customerUtil.experiment();
        System.out.println("result2="+result1);
        String result3= customerUtil.experiment();
        System.out.println("result3="+result1);
        String result4= customerUtil.experiment();
        System.out.println("result4="+result4);
        String result5= customerUtil.experiment();
        System.out.println("result5="+result5);
        String result6= customerUtil.experiment();
        System.out.println("result6="+result6);
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

