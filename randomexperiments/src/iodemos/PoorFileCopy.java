package iodemos;

import java.io.*;

public class PoorFileCopy {
    public static void main(String[] args) {
        PoorFileCopy demo=new PoorFileCopy();
        demo.run();
    }
    public void run() {
        InputStream inputStream=null;
        OutputStream outputStream=null;
        try {
            File inputFile = new File("C:/Users/vineets/work/ioexp/fruits.txt");
            File outFile=new File("C:/Users/vineets/work/ioexp/fruits-copy.txt");
            inputStream = new FileInputStream(inputFile);
            outputStream=new FileOutputStream(outFile);
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
        finally {
            close(inputStream);
            close(outputStream);
        }
    }
    void close(Closeable stream){
        try {
            stream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
