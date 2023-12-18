package com.maveric.didemo.beans;

import com.maveric.didemo.beans.IShape;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Square implements IShape {
    @Value("${square.side}")
    private double side;
    public Square(){}
    public Square(double side){
        this.side=side;
        System.out.println("inside square ctr side="+side);
    }

    @PostConstruct
    public void afterInit(){
        System.out.println("***inside Square after initialization side="+side);
    }

    @PreDestroy
    public  void beforeRemoval(){
        System.out.println("****square object to be removed from container");
    }


    public double getSide() {
        return side;
    }

    @Override
    public double area(){
        return side*side;
    }

    @Override
    public String toString() {
        return "Square side="+side;
    }
}
