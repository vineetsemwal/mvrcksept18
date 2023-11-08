package com.maveric.solid.substitution;

public class BusinessAccount extends SavingAccount{
    public BusinessAccount(double balance){
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance()<50000 || getBalance()<amount){
            throw new InSufficientSavingBalanceException("insufficient balance exception");
        }
        double remaining=getBalance()-amount;
        setBalance(remaining);
    }
}
