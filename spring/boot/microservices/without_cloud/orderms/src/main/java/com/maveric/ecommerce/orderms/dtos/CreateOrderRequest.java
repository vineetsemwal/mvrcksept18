package com.maveric.ecommerce.orderms.dtos;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CreateOrderRequest {

    private long customerId;
    private long productId;
    private int units;
}
