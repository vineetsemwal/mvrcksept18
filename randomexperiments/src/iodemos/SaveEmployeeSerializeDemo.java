package iodemos;

import equalsdemo.Customer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveEmployeeSerializeDemo {

    File customerFile = new File("C:/Users/vineets/work/ioexp/employee");
    public static void main(String[] args) {
        SaveEmployeeSerializeDemo demo=new SaveEmployeeSerializeDemo();
        Employee employee=new Employee(1,"sampath");
        demo.save(employee);
    }

    public void save(Employee employee) {
        try(
        FileOutputStream fileOutputStream=new FileOutputStream(customerFile);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        ){
            objectOutputStream.writeObject(employee);
            System.out.println("employee saved");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
