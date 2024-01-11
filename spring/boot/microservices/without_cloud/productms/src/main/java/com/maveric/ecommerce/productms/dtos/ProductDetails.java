package com.maveric.ecommerce.productms.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ProductDetails {
    private Long id;
    private String name;
    private double price;
}
