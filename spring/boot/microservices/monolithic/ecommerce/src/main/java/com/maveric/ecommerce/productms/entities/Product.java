package com.maveric.ecommerce.productms.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@Data
@Entity
public class Product {
    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private double price;
}
