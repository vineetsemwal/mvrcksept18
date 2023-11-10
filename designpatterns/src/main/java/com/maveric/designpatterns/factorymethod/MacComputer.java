package com.maveric.designpatterns.factorymethod;

public class MacComputer extends AbstractComputer{

    public MacComputer(String os, String processor){
        super(os, processor);
    }

    @Override
    public void boots() {
        System.out.println(getOs()+"-"+getProcessor()+"-" +"mac boots");
    }

    @Override
    public void works() {
        System.out.println(getOs()+"-"+getProcessor()+"-mac works");
    }

    @Override
    public void shutdown() {
        System.out.println(getOs()+"-"+getProcessor()+"-mac shutdowns");
    }
}
