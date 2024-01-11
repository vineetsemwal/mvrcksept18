package com.maveric.ecommerce.customerms.dto;

import com.maveric.ecommerce.customerms.util.CustomNotBlankAnnotation;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class CreateCustomerRequest {
    //@NotBlank(message = "name is not valid")
    @CustomNotBlankAnnotation(message = "name is not valid")
    private String name;

    @Max(100)
    @Min(10)
    private int age;

    private double balance;

    public CreateCustomerRequest(){}

    public CreateCustomerRequest(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
