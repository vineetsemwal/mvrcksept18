package com.maveric.designpatterns.factorymethod;

public class ComputerUsage {
    public static void main(String[] args) {
        IComputerFactory windowsFactory=new WindowComputerFactory();
        IComputerFactory macFactory=new MacComputerFactory();

        IComputer windowsComputer=windowsFactory.newComputer();
        IComputer macComputer=macFactory.newComputer();
        windowsComputer.boots();
        windowsComputer.works();
        windowsComputer.shutdown();

        macComputer.boots();
        macComputer.works();
        macComputer.shutdown();
    }
}
