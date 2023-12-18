package com.maveric.didemo.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle implements IShape {
    @Value("${circle.radius}")
    private double radius;

    public Circle(){}
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double area() {
        return 3.14*radius*radius;
    }
}
