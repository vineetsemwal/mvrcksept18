package inferencedemo;

public class VarDemo {
    public static void main(String[] args) {
     var calcy=new AbstractCalculator() {
          int lastResult;

          public int getLastResult() {
              return lastResult;
          }

          @Override
          public int add(int num1, int num2) {
             int result =num1+num2;
             lastResult=result;
             return lastResult;
          }
      };

      int result=calcy.add(1,2);
      calcy.getLastResult();

    }




}
