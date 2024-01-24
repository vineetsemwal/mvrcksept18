package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        ServiceImpl service = context.getBean(ServiceImpl.class);
        service.addTrainee("scooby", "cse", LocalDate.of(2001, 1, 1));
        service.addTrainee("scooby", "it", LocalDate.of(2001, 1, 1));
        service.addTrainee("vineet", "hr", LocalDate.of(2001, 1, 2));
        LocalDate startDate = LocalDate.of(2000, 1, 1);
        LocalDate endDate = LocalDate.now();

        List<Trainee> list = service.fetchTraineesByName("scooby", startDate, endDate);
        list.stream().forEach(System.out::println);
    }


}
