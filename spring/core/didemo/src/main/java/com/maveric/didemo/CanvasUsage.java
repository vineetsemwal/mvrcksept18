package com.maveric.didemo;

import com.maveric.didemo.beans.Canvas;
import com.maveric.didemo.beans.Circle;
import com.maveric.didemo.beans.IShape;
import com.maveric.didemo.beans.Square;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CanvasUsage {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        Canvas canvas1=context.getBean(Canvas.class);
        canvas1.drawShape();
        Canvas canvas2=context.getBean("canvas",Canvas.class);
        if (canvas1==canvas2){
            System.out.println("same object");
        }else {
            System.out.println("different objects");
        }



/*
        Square square=context.getBean(Square.class);
        System.out.println("square fetched side=="+square.getSide());
*/

    }
}
