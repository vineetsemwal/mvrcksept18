package com.maveric.didemo.beans;

import com.maveric.didemo.beans.IShape;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Square implements IShape {
    @Value("${square.side}")
    private double side;
    public Square(){}
    public Square(double side){
        this.side=side;
        System.out.println("inside square ctr side="+side);
    }

    public double getSide() {
        return side;
    }

    @Override
    public double area(){
        return side*side;
    }
}
