public class Feedback {
    int id;
    String description;
    Customer customer;

    Feedback(int id, String description, Customer customer){
        this.id=id;
        this.description=description;
        this.customer=customer;
    }

}
