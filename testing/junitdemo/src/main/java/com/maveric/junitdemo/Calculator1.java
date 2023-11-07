package com.maveric.junitdemo;

public class Calculator1 {

    public int add(int num1, int num2){
        return num1+num2;
    }

    public int addBy10(int num){
        int result=add(num,10);
        return result;
    }

    public int sub(int num1, int num2){
        return num1-num2;
    }

    public boolean isEven(int num){
        return num%2==0;
    }

}