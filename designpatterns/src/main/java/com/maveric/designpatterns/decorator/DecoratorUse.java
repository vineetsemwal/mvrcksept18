package com.maveric.designpatterns.decorator;

public class DecoratorUse {
    public static void main(String[] args) {
        IComponent original=new OriginalComponent();
        System.out.println("****circle wrapping original");
        IComponent circleWrappingOriginal=new CircleDecorator(original);
        circleWrappingOriginal.renders();

        System.out.println("****box wrapping original");
        IComponent boxWrappingOriginal=new BoxDecorator(original);
        boxWrappingOriginal.renders();


        System.out.println("*box wrapping circle--circle wrapping original");
        IComponent boxWrappingCircle=new BoxDecorator(circleWrappingOriginal);
        boxWrappingCircle.renders();
    }
}
