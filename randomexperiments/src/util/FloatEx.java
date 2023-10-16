package util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FloatEx {
    public static void main(String[] args) {
        String inputText=".100";
        BigDecimal bd1=new BigDecimal(inputText);
        BigDecimal bd2=new BigDecimal(inputText);
        BigDecimal bd3=new BigDecimal(inputText);
        BigDecimal result=bd1.add(bd2).add(bd3);
        result=result.setScale(4);
        BigDecimal expected=new BigDecimal(".3").setScale(4);
        boolean equals=result.equals(expected);
        System.out.println(equals);

        BigDecimal exp2=new BigDecimal("1.247");
        exp2=exp2.setScale(2, RoundingMode.HALF_UP);
        System.out.println(exp2);




    }
}
