package com.maveric.didemo;

public class Square implements IShape{
    private double side;
    public Square(){}
    public Square(double side){
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double area(){
        return side*side;
    }
}
