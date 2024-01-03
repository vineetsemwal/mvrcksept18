package com.maveric.customerms.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Aspect
@Component
public class ApplicationAspect {
/*
    @Before(value = "execution(* com.maveric.customerms.service.CustomerServiceImpl.*(..))")
    public void advice1(JoinPoint point) {
        System.out.println("*** inside advice1");
        Signature signature = point.getSignature();
        Object[] args = point.getArgs();
        List argsList = Arrays.asList(args);
        System.out.println("args=" + argsList);
        System.out.println("signature=" + signature);
    }


    @AfterReturning(value = "execution(* com.maveric.customerms.service.CustomerServiceImpl.*(..))",returning = "result")
    public void advice2(JoinPoint point, Object result) {
        System.out.println("*** inside advice2 after method execution");
        Signature signature = point.getSignature();
        Object[] args = point.getArgs();
        List argsList = Arrays.asList(args);
        System.out.println("args=" + argsList);
        System.out.println("signature=" + signature);
        System.out.println("result="+result);
    }
*/
    @Around(value = "execution(* com.maveric.customerms.service.CustomerServiceImpl.*(..))")
    public Object advice3(ProceedingJoinPoint point)throws Throwable {
        System.out.println("*** inside advice3");
        Signature signature = point.getSignature();
        Object[] args = point.getArgs();
        List argsList = Arrays.asList(args);
        System.out.println("args=" + argsList);
        System.out.println("signature=" + signature);

        Object result = point.proceed(args);
        Object target = point.getTarget();
        System.out.println("object whose method in execution =" + target);
        System.out.println("result=" + result);
        return result;
    }

}
