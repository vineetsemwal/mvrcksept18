package com.maveric.ecommerce.orderms.entities;

import com.maveric.ecommerce.customerms.domain.Customer;
import com.maveric.ecommerce.productms.entities.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = "id")
@Data
@Entity
public class CreatedOrder {
    @GeneratedValue
    @Id
    private Long id;

    private double orderPrice;

    private double productPrice;

    @ManyToOne
    private Product product;
    @ManyToOne
    private Customer customer;

    private int units;

}
