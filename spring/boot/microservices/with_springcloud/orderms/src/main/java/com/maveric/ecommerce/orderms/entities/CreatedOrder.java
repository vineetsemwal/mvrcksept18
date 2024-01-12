package com.maveric.ecommerce.orderms.entities;

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

    private long productId;

    private long customerId;

    private int units;

}
