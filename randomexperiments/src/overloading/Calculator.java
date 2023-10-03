package overloading;

public class Calculator {

    public int add(int num1,int num2){
        return num1+num2;
    }
    public int add(int num1,int num2, int num3){
        return num1+num2+num3;
    }

    public String add(String input1, String input2){
        return input1+input2;
    }

    public double add(double num1, double num2){
        return num1+num2;
    }


}
