package com.maveric.didemo;

public class Canvas {

    private IShape shape;

    public Canvas(IShape shape){
        this.shape =shape;
    }
    public void setShape(IShape shape){
        this.shape = shape;
    }

    public void drawShape(){
        double area= shape.area();
        System.out.println("drawing shape with area="+area);
    }

}
