package com.maveric.securitydemo.exceptions;

public class InvalidCustomerNameException extends Exception{
    public InvalidCustomerNameException(String msg){
        super(msg);
    }
}
