package com.maveric.designpatterns.factorymethod;

public class WindowComputerFactory implements IComputerFactory{
    @Override
    public IComputer newComputer() {
        return new WindowComputer("windows 11","intel i7");
    }
}
