package threadDemos;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEx1 {
    public static void main(String[] args) {
        AtomicInteger obj=new AtomicInteger(2);
       // int result1=obj.addAndGet(4);
      //  System.out.println("result="+result1);
        int result2=obj.accumulateAndGet(8,(a,b)->{
            System.out.println("a="+a+",b="+b);
            return (2*a)+(2*b);
        });
        System.out.println("result="+result2);
    }
}
