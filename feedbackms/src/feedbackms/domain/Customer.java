package feedbackms.domain;

public class Customer {
    private int id;
    private String name;

    public Customer(final int id,final String name){
        this.id=id;
        this.name=name;
    }
    public void setName(final String newName){
        name=newName;
    }

    public String getName(){
        return name;
    }

    public void setId(final int newId){
     this.id=newId;
    }

    public int getId(){
        return id;
    }

}
