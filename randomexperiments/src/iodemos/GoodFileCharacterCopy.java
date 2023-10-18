package iodemos;

import java.io.*;

public class GoodFileCharacterCopy {
    public static void main(String[] args) {
        File inputFile = new File("C:/Users/vineets/work/ioexp/fruits.txt");
        File outFile = new File("C:/Users/vineets/work/ioexp/fruits-copy.txt");
        try (
                Reader reader = new FileReader(inputFile);
                BufferedReader bufferedReader = new BufferedReader(reader);
                Writer writer = new FileWriter(outFile);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
        ) {
            int red;
            char buffer[] = new char[100];
            while ((red = bufferedReader.read(buffer)) > 0) {
                String caps = new String(buffer).toUpperCase();
                bufferedWriter.write(caps);

            }
            bufferedWriter.flush();

            System.out.println("copy complete");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
