package com.maveric.designpatterns.decorator;

public class CircleDecorator extends AbstractDecorator{
    public CircleDecorator(IComponent original){
        super(original);
    }

    @Override
    public void renders() {
        System.out.println("****circle rendering started");
        super.renders();
        System.out.println("****circle rendering completed");
    }
}
