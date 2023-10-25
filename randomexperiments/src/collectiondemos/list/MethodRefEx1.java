package collectiondemos.list;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class MethodRefEx1 {
    public static void main(String[] args) {
        MethodRefEx1 demo=new MethodRefEx1();
        BinaryOperator<Integer>operator=demo::add;
        Consumer<Integer>consumer= System.out::println;

    }
    int add(int num1, int num2){
        return num1+num2;
    }
}
