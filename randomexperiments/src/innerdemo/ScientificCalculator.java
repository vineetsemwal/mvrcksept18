package innerdemo;

public class ScientificCalculator {
    private int lastNumberValue;
    private String lastStringValue;

    public String getLastStringValue() {
        return lastStringValue;
    }

    public int getLastNumberValue(){
        return lastNumberValue;
    }
    private StringOperations stringOperations=new StringOperations();

    public StringOperations getStringOperations() {
        return stringOperations;
    }
    public int add(int num1, int num2){
        return mathOperations.add(num1, num2);
    }

    private MathOperations mathOperations=new MathOperations();
    public MathOperations getMathOperations(){
        return mathOperations;
    }

    class  StringOperations{
        public String concat(String input1, String input2){
            return lastStringValue=input1+input2;
        }
        public String getFirstTwoChars(String input){
            return lastStringValue=input.substring(0,2);
        }
    }
    class MathOperations {

       public int add(int num1, int num2){
            return lastNumberValue =num1+num2;
        }
        public int sub(int num1, int num2){
           return lastNumberValue =num1-num2;
        }
    }
}
