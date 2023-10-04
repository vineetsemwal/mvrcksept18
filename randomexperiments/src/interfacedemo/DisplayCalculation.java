package interfacedemo;

public class DisplayCalculation {
    public static void main(String[] args) {
        IScientificCalculator calculator=new CasioCalculator();
        String result=calculator.add("hello","world");
        System.out.println("result="+result);

    }

}
