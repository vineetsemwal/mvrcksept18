package equalsdemo;

import java.io.Serializable;

public class Customer implements Serializable {

    private int id;
    private String name;

    public Customer(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj ==null || !(obj instanceof Customer)){
            return false;
        }
        Customer that=(Customer) obj;
        return id==that.id;
    }

}
