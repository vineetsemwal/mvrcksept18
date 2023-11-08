package com.maveric.solid.substitution;

public class BankUse {
    public static void main(String[] args) {
        SavingAccount account=new BusinessAccount(10000);
        account.withdraw(100);
        System.out.println("100 withdrawn");
    }
}
