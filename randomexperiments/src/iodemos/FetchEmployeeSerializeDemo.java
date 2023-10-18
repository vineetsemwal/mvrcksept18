package iodemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FetchEmployeeSerializeDemo {
    public static void main(String[] args) {
        String filePath="C:/Users/vineets/work/ioexp/employee";
       FetchEmployeeSerializeDemo demo=new FetchEmployeeSerializeDemo();
       Employee employee=demo.fetchCustomer(filePath);
        System.out.println("employee--"+employee.getId()+"-"+employee.getName());
    }

    Employee fetchCustomer(String filePath) {
        File file = new File(filePath);
        try (
                FileInputStream inputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        ) {
           Object employeeRef =objectInputStream.readObject();
           Employee employee=(Employee) employeeRef;
           return employee;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }

}
