package com.maveric.ecommerce.customerms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ProductDetails {
    private Long id;
    private String name;
    private double price;
}
