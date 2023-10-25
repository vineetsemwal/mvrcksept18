package fiLambda;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class OperatorEx1 {
    public static void main(String[] args) {
        UnaryOperator<Integer>square= num->num*num;
        int result1=square.apply(4);
        System.out.println("result1="+result1);
        BinaryOperator<Integer>adder=(num1,num2)->num1+num2;
        int result2=adder.apply(3,4);
        System.out.println("result2="+result2);
    }
}
