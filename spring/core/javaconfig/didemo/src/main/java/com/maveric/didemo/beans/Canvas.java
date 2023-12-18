package com.maveric.didemo.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Scope("prototype")
@Component
public class Canvas {


    //@Autowired
    private ApplicationContext context;

   @Qualifier("square")
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

    @PostConstruct
    public void afterInit(){
        System.out.println("***inside Canvas after initialization shape="+shape);
        //System.out.println("***context="+context);
    }

}
