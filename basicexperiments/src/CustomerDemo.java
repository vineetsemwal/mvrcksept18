//create customer array and add the customers in array
public class CustomerDemo {
    int index=0;
    Customer store[]=new Customer[2];
    void add(Customer customer){
        store[index]=customer;
        index++;
    }

    public static void main(String[] args) {
        CustomerDemo demo=new CustomerDemo();

        Customer customer1=new Customer(1,"mahesh",10000);
        Customer customer2=new Customer(2, "sampath",20000);
        demo.add(customer1);
        demo.add(customer2);

        customer1.changeNameToBlock();
        customer1.increaseBalanceBy(500);

        for (int i=0;i<store.length;i++){
           Customer retrieved =store[i];
            System.out.println(retrieved.id+"-"+retrieved.name+"-"+retrieved.balance);
        }

        System.out.println("customer1="+customer1.id+"-"+customer1.name+"-"+customer1.balance);
        System.out.println("customer2="+customer2.id+"-"+customer2.name+"-"+customer2.balance);

    }



}
