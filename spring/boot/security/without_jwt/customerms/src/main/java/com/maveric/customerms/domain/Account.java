package com.maveric.customerms.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
