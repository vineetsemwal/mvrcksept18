package interfacedemo;

public class DisplayCalculation {
    public static void main(String[] args) {
        ICalculator calculator=new CasioCalculator();
        int result=calculator.add(1,2);
        System.out.println("result="+result);

    }

}
