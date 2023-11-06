package com.maveric.loggingdemo3;

import java.math.BigDecimal;

public class SavingAccountRequestDto {
    private String name;
    private BigDecimal minOpeningBalance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMinOpeningBalance() {
        return minOpeningBalance;
    }

    public void setMinOpeningBalance(BigDecimal minOpeningBalance) {
        this.minOpeningBalance = minOpeningBalance;
    }

}
