package com.maveric.ecommerce.orderms.exceptions;

public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(String msg){
        super(msg);
    }
    public ProductNotFoundException(String msg,Throwable cause){
        super(msg,cause);
    }

}
