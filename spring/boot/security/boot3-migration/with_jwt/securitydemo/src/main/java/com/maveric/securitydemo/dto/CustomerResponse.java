package com.maveric.securitydemo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CustomerResponse {
    private long customerId;
    private long accountId;
    private String name;
    private int age;
    private double balance;
    private String username;
}
