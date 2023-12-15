package com.maveric.didemo.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Canvas {
    @Autowired
    private IShape shape;
/*
    public Canvas(IShape shape){
        this.shape =shape;
    }
    */


    public void setShape(IShape shape){
        this.shape = shape;
    }

    public void drawShape(){
        System.out.println("****isnide drawshape shape="+shape.getClass().getName());
        double area= shape.area();
        System.out.println("drawing shape with area="+area);
    }

}
