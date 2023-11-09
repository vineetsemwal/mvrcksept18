package com.maveric.solid.di;

public class CanvasTest {
    public static void main(String[] args) {
        Square square=new Square(7);
        Canvas canvas1=new Canvas(square);
        canvas1.draw();

        Circle circle=new Circle(3);
        Canvas canvas2=new Canvas(circle);
        canvas2.draw();
    }
}
