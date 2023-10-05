package overriding;

public class Customer {
    private static int count;
    private long id;
    private String name;

    public Customer(long id, String name) {
        count++;
        this.id = id;
        this.name = name;
    }

    public static   int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return id+"-"+count+"-"+name;
    }
}
