package iodemos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class CustomScannerEx {
    public static void main(String[] args) {
        try (
                Reader reader = new InputStreamReader(System.in);
                BufferedReader bufferedReader = new BufferedReader(reader)
        ) {
            String line = bufferedReader.readLine();
            String parts[] = line.split("\\p{javaWhitespace}+");
            int total = 0;
            for (String part : parts) {
                Integer part1Int = Integer.parseInt(part);
                total = total + part1Int;
            }
            System.out.println("total=" + total);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
