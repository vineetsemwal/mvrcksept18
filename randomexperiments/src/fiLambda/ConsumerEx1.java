package fiLambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerEx1 {
    public static void main(String[] args) {
        IPrint printer1=msg->{
            String up=msg.toUpperCase();
            System.out.println(up);
        };
        printer1.printUppercase("hello");

        Consumer<String>printer2=msg->{
            String up=msg.toUpperCase();
            System.out.println(up);
        };
        printer2.accept("bye");
        BiConsumer<String,Integer>concatTimes=(input,times)->{
            String result="";
            for (int i=0;i<times;i++){
                result=result+input;
            }
            System.out.println("result="+result);
        };
        concatTimes.accept("nangalore",3);
    }

    private static interface IPrint{
        void printUppercase(String input);
    }
}
