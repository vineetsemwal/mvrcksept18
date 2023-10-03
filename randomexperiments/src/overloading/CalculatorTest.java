package overloading;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calcy=new Calculator();
        int res1=calcy.add(1,2);
        int res2=calcy.add(3,4,5);
        String res3=calcy.add("hello","world");
        System.out.println("res1="+res1);
        System.out.println("res2="+res2);
        System.out.println("res3="+res3);
    }
}
