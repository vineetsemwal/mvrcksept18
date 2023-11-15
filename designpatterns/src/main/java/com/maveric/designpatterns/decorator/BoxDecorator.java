package com.maveric.designpatterns.decorator;

public class BoxDecorator  extends AbstractDecorator{

    public BoxDecorator(IComponent original){
    super(original);
    }

    @Override
    public void renders() {
        System.out.println("*****rectangle box started");
        super.renders();
        System.out.println("*****rectangle box finished");
    }
}
