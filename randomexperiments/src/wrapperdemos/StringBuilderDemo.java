package wrapperdemos;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder result=new StringBuilder();
        for (int i=0;i<100;i++){
            result.append(i);
        }
        System.out.println(result.toString());

    }
}
