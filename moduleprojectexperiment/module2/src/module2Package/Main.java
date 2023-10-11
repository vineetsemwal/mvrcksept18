package module2Package;

import module1Package1.*;

public class Main {
    public static void main(String[] args) {
        Greeter1 greeter = new Greeter1();
        String msg=greeter.greets();
        System.out.println("greeting="+msg);
    }
}