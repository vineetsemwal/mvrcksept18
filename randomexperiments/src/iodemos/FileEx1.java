package iodemos;

import java.io.File;

public class FileEx1 {
    public static void main(String[] args) {
        File file = new File("C:/Users/vineets/work");
        if (file.isDirectory()) {
            File files[] = file.listFiles();
            for (File iteratedFile:files){
                boolean isDir=iteratedFile.isDirectory();
                String name=iteratedFile.getName();
                System.out.println("name="+name+" is dir="+isDir);
            }

        }

        /*boolean isFile=file.isFile();
        boolean isExecutable=file.canExecute();
        boolean isDir=file.isDirectory();
        String name=file.getName();
        System.out.println("name="+name);
        System.out.println("is file="+isFile+",isexecutable="+isExecutable+",isdir="+isDir);
*/
    }
}
