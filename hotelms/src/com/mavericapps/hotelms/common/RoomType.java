package com.mavericapps.hotelms.common;

public enum RoomType {
    Deluxe(10000), Standard(5000);

    private double pricePerDay;
    RoomType(double pricePerDay){
        this.pricePerDay=pricePerDay;
    }
    double getPricePerDay(){
        return pricePerDay;
    }

}
