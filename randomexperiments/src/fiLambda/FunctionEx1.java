package fiLambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionEx1 {
    public static void main(String[] args) {
        ILengthFinder finder1 = input -> input.length();
        int length1 = finder1.find("hello");
        System.out.println("length1=" + length1);

        Function<String, Integer> finder2 = input -> input.length();
        int length2 = finder2.apply("hello");
        System.out.println("length2=" + length2);

        IStringConcat concater1 = (input, times) -> {
            String result = "";
            for (int i = 0; i < times; i++) {
                result = result + input;
            }
            return result;
        };
        String times1 = concater1.concant("hello", 2);
        System.out.println("times1=" + times1);
        BiFunction<String, Integer, String> concater2 = (input, times) -> {
            String result = "";
            for (int i = 0; i < times; i++) {
                result = result + input;
            }
            return result;
        };
        String times2 = concater2.apply("hi", 2);
        System.out.println("times2="+times2);
    }

    private static interface IStringConcat {
        String concant(String input, int times);
    }

    @FunctionalInterface
    private static interface ILengthFinder {
        int find(String input);
    }

}
