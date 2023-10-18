package iodemos;

import java.io.*;

public class GoodFileCopy {
    public static void main(String[] args) {

        File inputFile = new File("C:/Users/vineets/work/ioexp/file.mp4");
        File outFile = new File("C:/Users/vineets/work/ioexp/file2.mp4");
        try (
                InputStream inputStream = new FileInputStream(inputFile);
                OutputStream outputStream = new FileOutputStream(outFile);
                InputStream bufferedInputStream = new BufferedInputStream(inputStream);
                OutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        ) {
            byte[] buffer = new byte[100];
            int bytesRed;
            int bytesCount = 0;
            while ((bytesRed = bufferedInputStream.read(buffer)) > 0) {
                bufferedOutputStream.write(buffer, 0, bytesRed);
                bytesCount = bytesCount + bytesRed;
            }

            System.out.println("file copy complete");
        } catch (IOException e) {
            System.out.println("exception in reading");
            e.printStackTrace();
        }
    }
}
