package iodemos;

import java.io.*;

public class PoorFileCopyAutoClosing {
    public static void main(String[] args)  {
        PoorFileCopyAutoClosing demo=new PoorFileCopyAutoClosing();
        demo.run();
    }
    public void run() {
        File inputFile = new File("C:/Users/vineets/work/ioexp/fruits.txt");
        File outFile=new File("C:/Users/vineets/work/ioexp/fruits-copy.txt");
        try(
                InputStream inputStream = new FileInputStream(inputFile);
                OutputStream outputStream=new FileOutputStream(outFile)
        ) {

            int b=-1;
            int bytesCount=0;
            while ((b=inputStream.read())>0){
                outputStream.write(b);
                bytesCount++;
            }
            System.out.println("\nbytes read="+bytesCount);

        } catch (IOException e) {
            System.out.println("exception in reading");
            e.printStackTrace();
        }

    }

}
