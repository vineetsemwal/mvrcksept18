package fiLambda;

import java.util.function.BiPredicate;

public class Util {

     boolean isSumEven(int num1, int num2){
         return (num1+num2)%2==0;
     }

     boolean isTest(BiPredicate<Integer,Integer>predicate, int num1, int num2){
         return predicate.test(num1, num2);
     }
}
