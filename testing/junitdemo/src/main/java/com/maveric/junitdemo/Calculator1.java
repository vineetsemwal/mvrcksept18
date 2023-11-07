package com.maveric.junitdemo;

import org.apache.logging.log4j.util.Strings;

import java.util.ArrayList;
import java.util.List;

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

    public String toBlockString(String input)throws InvalidTextException{
        if(Strings.isBlank(input)){
            throw new InvalidTextException("input is null or empty");
        }
        char blockChar=Character.toUpperCase(input.charAt(0));
        String result=blockChar+input.substring(1);
        return result;
    }

}