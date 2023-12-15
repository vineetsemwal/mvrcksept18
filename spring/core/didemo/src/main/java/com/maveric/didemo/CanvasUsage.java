package com.maveric.didemo;

public class CanvasUsage {
    public static void main(String[] args) {
        IShape square1=new Square(6);
        Canvas canvas1=new Canvas(square1);
        canvas1.drawShape();

        IShape square2=new Circle(8);
        Canvas canvas2=new Canvas(square2);
        canvas2.drawShape();
    }
}
