//create customer array and add the customers in array
public class CustomerMain {

    public static void main(String[] args) {

        Customer customer1=new Customer(1,"mahesh",10000);

        customer1.changeNameToBlock();
        customer1.increaseBalanceBy(500);

        Customer customer2=new Customer(2, "sampath",20000);

        System.out.println("customer1="+customer1.id+"-"+customer1.name+"-"+customer1.balance);
        System.out.println("customer2="+customer2.id+"-"+customer2.name+"-"+customer2.balance);

    }
}
