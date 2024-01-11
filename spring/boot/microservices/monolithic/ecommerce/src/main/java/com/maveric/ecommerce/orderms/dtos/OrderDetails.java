package com.maveric.ecommerce.orderms.dtos;

import com.maveric.ecommerce.productms.dtos.ProductDetails;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class OrderDetails {
    private Long id;
    private double orderPrice;
    private double productPrice;
    private int units;
    private Long productId;
    private String productName;
    private long customerId;
    private String customerName;

}
