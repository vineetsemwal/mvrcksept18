package com.maveric.solid.substitution;

public class InSufficientSavingBalanceException extends RuntimeException{
    public InSufficientSavingBalanceException(String msg){
        super(msg);
    }
}
