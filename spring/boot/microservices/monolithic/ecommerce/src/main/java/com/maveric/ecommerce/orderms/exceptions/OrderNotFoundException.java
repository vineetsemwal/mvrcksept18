package com.maveric.ecommerce.orderms.exceptions;


public class OrderNotFoundException extends Exception {
    public OrderNotFoundException(String msg){
        super(msg);
    }
}
