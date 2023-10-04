package interfacedemo;

public interface ICalculator {

    private int internalAdd(int num1, int num2){
        return num1+num2;
    }

  default int add(int num1, int  num2){
        return  internalAdd(num1, num2);
    }

    int sub(int num1, int num2);
}
