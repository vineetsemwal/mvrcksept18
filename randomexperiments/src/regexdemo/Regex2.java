package regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        String input1 = "how are you, where aare you";
        String regex = "a+re";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input1);

        while (matcher.find()) {
           String group= matcher.group();
           int patternStart=matcher.start();
           int patternEnd= matcher.end();
            System.out.println("pattern start="+patternStart+" end="+patternEnd);
            System.out.println("found group="+group);
        }
    }
}
