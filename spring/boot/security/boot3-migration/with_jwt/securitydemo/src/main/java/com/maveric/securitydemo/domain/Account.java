package com.maveric.securitydemo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    private  double balance;

    @OneToOne(mappedBy = "account")
    private Customer customer;
}
