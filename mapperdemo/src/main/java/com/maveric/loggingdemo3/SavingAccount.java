package com.maveric.loggingdemo3;

import java.math.BigDecimal;

public class SavingAccount {

    private long id;
    private BigDecimal balance;
    private BigDecimal minOpeningBalance;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getMinOpeningBalance() {
        return minOpeningBalance;
    }

    public void setMinOpeningBalance(BigDecimal minOpeningBalance) {
        this.minOpeningBalance = minOpeningBalance;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", minOpeningBalance=" + minOpeningBalance +
                '}';
    }
}
