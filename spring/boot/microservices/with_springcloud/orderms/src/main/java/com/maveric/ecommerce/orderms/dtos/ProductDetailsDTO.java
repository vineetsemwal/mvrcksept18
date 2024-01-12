package com.maveric.ecommerce.orderms.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ProductDetailsDTO {
    private Long id;
    private String name;
    private double price;
}
