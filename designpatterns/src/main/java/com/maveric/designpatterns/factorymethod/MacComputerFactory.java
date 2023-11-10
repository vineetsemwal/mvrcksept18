package com.maveric.designpatterns.factorymethod;

public class MacComputerFactory implements IComputerFactory{
    @Override
    public IComputer newComputer() {
        return new MacComputer("macos 11","M2");
    }
}
