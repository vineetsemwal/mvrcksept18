package com.maveric.designpatterns.factorymethod;

public class WindowComputer extends AbstractComputer{
    public WindowComputer(String os, String processor){
        super(os, processor);
    }
    @Override
    public void boots() {
        System.out.println(getOs()+"-"+getProcessor() +"Window computer boots");
    }

    @Override
    public void works() {
        System.out.println(getOs()+"-"+getProcessor() +"window computer works");
    }

    @Override
    public void shutdown() {
        System.out.println(getOs()+"-"+getProcessor()+"-"+ "window computer shutdown");
    }
}
