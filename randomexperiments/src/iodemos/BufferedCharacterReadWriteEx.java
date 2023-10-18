package iodemos;

import java.io.*;

public class BufferedCharacterReadWriteEx {
    public static void main(String[] args) {
        try(
            Reader reader=new InputStreamReader(System.in);
            BufferedReader bufferedReader=new BufferedReader(reader);
            Writer writer=new OutputStreamWriter(System.out);
            BufferedWriter bufferedWriter=new BufferedWriter(writer);
        ){
            String line;
            while (!(line=bufferedReader.readLine()).equals("exit")){
              bufferedWriter.write(line);
            }
            bufferedWriter.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
