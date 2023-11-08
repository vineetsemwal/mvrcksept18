package com.maveric.solid.substitution;

public class VehicleUse {

    public static void main(String[] args) {
        TwoWheelerVehicle vehicle=new Bike();
        vehicle.accelerate();
        vehicle.applyStand();
    }
}
