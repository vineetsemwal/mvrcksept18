package fiLambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateEx1 {
    public static void main(String[] args) {
        IEvenChecker checker1=input->input%2==0;
        boolean result1=checker1.isEven(8);
        System.out.println("resul1="+result1);

        Predicate<Integer>checker2=input->input%2==0;
        boolean result2=checker2.test(8);
        System.out.println("resul2="+result2);
        BiPredicate<Integer,Integer>sumEven=(input1,input2)->(input1+input2)%2==0;
        boolean result3=sumEven.test(3,5);
        System.out.println("result3="+result3);

        Util util=new Util();
        boolean result4=util.isSumEven(5,6);
        System.out.println("result4="+result4);
        boolean result5=util.isTest(sumEven,8,9);
        System.out.println("result5="+result5);
    }
    @FunctionalInterface
    private static interface IEvenChecker{
        boolean isEven(int input);
    }
}
