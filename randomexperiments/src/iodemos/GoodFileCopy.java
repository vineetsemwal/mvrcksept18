package iodemos;

import java.io.*;

public class GoodFileCopy {
    public static void main(String[] args) {
        try {
            File inputFile = new File("C:/Users/vineets/work/ioexp/file.mp4");
            File outFile=new File("C:/Users/vineets/work/ioexp/file2.mp4");
            InputStream inputStream = new FileInputStream(inputFile);
            OutputStream outputStream=new FileOutputStream(outFile);
            byte[]buffer=new byte[100];
            int bytesRed;
            int bytesCount=0;
            while ((bytesRed=inputStream.read(buffer))>0){
                outputStream.write(buffer,0,bytesRed);
                bytesCount=bytesCount+bytesRed;
            }
            outputStream.flush();
            inputStream.close();
            outputStream.close();
            System.out.println("file copy complete");
        } catch (IOException e) {
            System.out.println("exception in reading");
            e.printStackTrace();
        }
    }
}
