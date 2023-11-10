package com.maveric.designpatterns.factorymethod;

public abstract class AbstractComputer implements IComputer{

    private String os;
    private String processor;

    public AbstractComputer(String os, String processor){
        this.os=os;
        this.processor=processor;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
}
