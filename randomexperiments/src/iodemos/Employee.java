package iodemos;

import java.io.Serializable;

public class Employee implements Serializable {
    private int id;
    private String name;
    
    public Employee(){}
    public Employee(int id, String name){
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

}
