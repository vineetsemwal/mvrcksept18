package com.maveric.solid.di;

public class Square implements Shape{

    private double side;

    public Square(double side){
        this.side=side;
    }

    public double getSide(){
        return side;
    }

    @Override
    public double area() {
        return  side*side;
    }
}
