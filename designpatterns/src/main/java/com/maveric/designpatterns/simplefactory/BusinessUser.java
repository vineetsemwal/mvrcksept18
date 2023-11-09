package com.maveric.designpatterns.simplefactory;

public class BusinessUser extends User{
    private String discountOffer;

    public String getDiscountOffer() {
        return discountOffer;
    }

    public void setDiscountOffer(String discountOffer) {
        this.discountOffer = discountOffer;
    }
}
