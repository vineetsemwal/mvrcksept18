package com.maveric.customerms.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.OneToOne;

@Entity
public class Account {

    @GeneratedValue
    private Long id;

    private  double balance;

    @OneToOne(mappedBy = "customer")
    private Customer customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
