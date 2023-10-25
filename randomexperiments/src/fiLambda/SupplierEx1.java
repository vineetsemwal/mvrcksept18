package fiLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierEx1 {
    public static void main(String[] args) {
        Greeter greeter1 = () -> "hello";
        String msg1 = greeter1.greet();
        System.out.println("msg1=" + msg1);
        Greeter greeter2 = () -> {
            String msg = "hi";
            return msg;
        };
        String msg2 = greeter2.greet();
        System.out.println("msg2=" + msg2);
        Supplier<String> greeter3 = () -> "bye";
        String msg3 = greeter3.get();
        System.out.println("msg3=" + msg3);

        Supplier<List<Integer>> supplier4 = () -> {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            return list;
        };
        List<Integer> list = supplier4.get();
        System.out.println(list);
    }

    private interface Greeter {
        String greet();
    }

}
