package innerdemo;

public class ScientificCalculatorNestedDemo {
    public static void main(String[] args) {
        ScientificCalculator calculator=new ScientificCalculator();
        ScientificCalculator.MathOperations mathOperations=calculator.getMathOperations();
        int result=mathOperations.add(1,2);
        int lastStoredValue=calculator.getLastNumberValue();
        System.out.println(lastStoredValue);
    }
}
