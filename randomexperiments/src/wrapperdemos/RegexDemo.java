package wrapperdemos;

public class RegexDemo {
    public static void main(String[] args) {
        String str1="bababa";
        boolean match=str1.matches("[ba]+");
        System.out.println("match="+match);
    }
}
