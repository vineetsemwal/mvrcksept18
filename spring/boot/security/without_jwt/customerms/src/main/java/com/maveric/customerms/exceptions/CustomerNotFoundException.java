package com.maveric.customerms.exceptions;

import com.maveric.customerms.domain.Customer;

public class CustomerNotFoundException extends Exception{
    public CustomerNotFoundException(String msg){
        super(msg);
    }
}
