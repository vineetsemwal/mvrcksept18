package regexdemo;

public class RegexEx1 {
    public static void main(String[] args) {
        String input1="11008800,Govinda,SDE";
        RegexEx1 demo=new RegexEx1();
        demo.printEmployee(input1);

        String input2="how are you";
        String parts2[]=input2.split("are");
        for (String part:parts2){
            System.out.println(part);
        }

    }
    void printEmployee(String csvInput){
        String parts[]=csvInput.split(",");
        System.out.println("id="+parts[0]);
        System.out.println("name="+parts[1]);
        System.out.println("designation="+parts[2]);
    }
}
