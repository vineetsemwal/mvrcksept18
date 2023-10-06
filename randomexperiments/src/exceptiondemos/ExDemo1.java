package exceptiondemos;

public class ExDemo1 {

    public static void main(String[] args) {
        ExDemo1 demo=new ExDemo1();
        String input=null;
        String result=demo.getBlockLetterString(input);
        System.out.println("input="+input);
        System.out.println("result="+result);
    }

    /**
     *
     * return string where first letter is capital
     */
    String getBlockLetterString(String input){
        System.out.println("inside getBlockLetterString(*)");
        try {
            char firstChar = input.charAt(0);
            char capitalCase = Character.toUpperCase(firstChar);
            String desired = capitalCase + input.substring(1);
            System.out.println("returning result");
            return desired;
        }catch (NullPointerException e){
            System.out.println("exception caught,input is null");
            System.out.println("exception msg="+e.getMessage());
           // e.printStackTrace();
            return null;
        }
    }
}
