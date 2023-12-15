package com.maveric.didemo.beans;

public class Circle implements IShape {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double area() {
        return 3.14*radius*radius;
    }
}
