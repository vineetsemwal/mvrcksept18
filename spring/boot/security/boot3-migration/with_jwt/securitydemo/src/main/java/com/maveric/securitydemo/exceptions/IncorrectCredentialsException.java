package com.maveric.securitydemo.exceptions;

public class IncorrectCredentialsException extends RuntimeException{
    public IncorrectCredentialsException(String msg){
        super(msg);
    }
}
