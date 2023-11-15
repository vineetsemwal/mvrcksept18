package com.maveric.designpatterns.decorator;


public abstract class AbstractDecorator implements IComponent{

    private IComponent original;

    public AbstractDecorator(IComponent original){
        this.original=original;
    }

    public IComponent getOriginal(){
        return original;
    }

    @Override
    public void renders() {
        original.renders();
    }
}
