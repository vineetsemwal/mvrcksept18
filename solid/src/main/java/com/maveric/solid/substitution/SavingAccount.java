package com.maveric.solid.substitution;

public class SavingAccount {
    private double balance;

    public SavingAccount(double balance){
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }

    public void  setBalance(double balance){
        this.balance=balance;
    }

    public void withdraw(double amount){
        if(amount>balance){
            throw new InSufficientSavingBalanceException("insufficient balance");
        }
        balance=balance-amount;
    }

}
