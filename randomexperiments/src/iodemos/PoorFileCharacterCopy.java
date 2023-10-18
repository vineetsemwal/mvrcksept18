package iodemos;

import java.io.*;

public class PoorFileCharacterCopy {
    public static void main(String[] args) {
        File inputFile = new File("C:/Users/vineets/work/ioexp/fruits.txt");
        File outFile = new File("C:/Users/vineets/work/ioexp/fruits-copy.txt");
        try (
                Reader reader = new FileReader(inputFile);
                Writer writer = new FileWriter(outFile);
        ) {
            int b = -1;
            int bytesCount = 0;
            while ((b = reader.read()) > 0) {
                char readChar = (char) b;
                char upperCaseChar = Character.toUpperCase(readChar);
                System.out.println("uppercase char code=" + upperCaseChar);
                writer.write(upperCaseChar);
                bytesCount++;
            }
            System.out.println("\nbytes read=" + bytesCount);

        } catch (IOException e) {
            System.out.println("exception in reading");
            e.printStackTrace();
        }
    }
}
