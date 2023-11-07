package com.maveric.junitdemo;

public class Calculator2 {
    private Adder adder;
    public Calculator2(Adder adder){
        this.adder=adder;
    }

    public int sum(int num1, int num2){
        System.out.println("***inside sum of Calculator2");
        int result=adder.add(num1,num2);
        return result;
    }
}
