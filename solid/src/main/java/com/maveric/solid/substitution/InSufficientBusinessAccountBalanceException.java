package com.maveric.solid.substitution;

public class InSufficientBusinessAccountBalanceException extends RuntimeException{
    public InSufficientBusinessAccountBalanceException(String msg){
        super(msg);
    }
}
