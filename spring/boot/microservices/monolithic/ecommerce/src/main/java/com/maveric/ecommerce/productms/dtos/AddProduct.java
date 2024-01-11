package com.maveric.ecommerce.productms.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AddProduct {
    @NotBlank
    private String name;
    @Min(0)
    private double price;
}
