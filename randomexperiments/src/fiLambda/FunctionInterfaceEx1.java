package fiLambda;

public class FunctionInterfaceEx1 {

    public static void main(String[] args) {

        IAdder adder1=new IAdder() {
            @Override
            public int add(int num1, int num2) {
                System.out.println("inside anonymous add");
                return num1+num2;
            }
        };
        int result1= adder1.add(1,2);
        IAdder adder2=(num1,num2)->num1+num2;
        int result2= adder2.add(3,4);
        IAdder adder3=(num1,num2)->{
            System.out.println("**inside lambda block add");
            int result=num1+num2;
            return result;
        };
        int result3=adder3.add(5,6);
        System.out.println("result="+result1+",result2="+result2+",result3="+result3);

    }

    @FunctionalInterface
    private static interface IAdder{

        int add(int num1, int num2);

    }
}
