package overriding;

public class Bike extends Vehicle{
    public Bike(String id){
        super(id);
    }

    @Override
    public void moves() {
        System.out.println(getId()+"-bike moves");
    }
}
