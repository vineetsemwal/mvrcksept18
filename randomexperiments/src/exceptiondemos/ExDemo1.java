package exceptiondemos;

public class ExDemo1 {

    public static void main(String[] args) {
        ExDemo1 demo = new ExDemo1();
        String input = "";
        try {
            String result = demo.getBlockLetterString(input);
            System.out.println("input=" + input);
            System.out.println("result=" + result);
            char firstChar = result.charAt(0);
            System.out.println("input first char =" + firstChar);
        }catch (InvalidInputException e){
            System.out.println("input you provided was wrong");
        }
        finally {
            System.out.println("i am always executed");
        }
    }

    /**
     * return string where first letter is capital
     * throws InvalidInputException if input is null or blank
     */
    String getBlockLetterString(String input)throws InvalidInputException{
            System.out.println("inside getBlockLetterString(*)");
            if (input == null || input.isBlank()) {
                throw new InvalidInputException("invalid input");
            }
            char firstChar = input.charAt(0);
            char capitalCase = Character.toUpperCase(firstChar);
            String desired = capitalCase + input.substring(1);
            System.out.println("returning result");
            return desired;


    }

}
