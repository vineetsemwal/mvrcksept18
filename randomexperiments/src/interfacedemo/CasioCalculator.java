package interfacedemo;

public class CasioCalculator implements ICalculator, IScientificCalculator {


    @Override
    public String add(String str1, String str2) {
        return str1+str2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1-num2;
    }
}
