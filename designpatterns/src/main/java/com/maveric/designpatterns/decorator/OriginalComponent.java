package com.maveric.designpatterns.decorator;

public class OriginalComponent implements IComponent{
    @Override
    public void renders() {
        System.out.println("original component renders");
    }
}
