package innerdemo;

import java.util.Map;

public class OuterEx {
    public static void main(String[] args) {
        Outer outer=new Outer(15);
        Outer.Inner inner=outer.new Inner();
        int result =inner.addBy10();
        System.out.println(result);
    }
}
