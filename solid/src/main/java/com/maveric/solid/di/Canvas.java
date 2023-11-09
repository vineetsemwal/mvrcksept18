package com.maveric.solid.di;

public class Canvas {
    private Shape shape;

    public Canvas(Shape square){
        this.shape =square;
    }

    public void draw(){
        double area= shape.area();
        System.out.println("drawing shape area="+area);
    }

}
