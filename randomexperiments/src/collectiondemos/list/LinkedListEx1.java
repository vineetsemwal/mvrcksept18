package collectiondemos.list;

import collectiondemos.Product;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx1 {
    public static void main(String[] args) {
        ArrayListx1 demo=new ArrayListx1();
        List<Product> list = new LinkedList<>();
        list.add(new Product(1,"moto"));
        list.add(new Product(2,"samsung"));

        Deque<Product>deq=new LinkedList<>();
        deq.add(new Product(3,"moto"));
        deq.add(new Product(2,"samsung"));
        deq.addFirst(new Product(4,"iphone"));
        System.out.println("**** queue="+deq);
        System.out.println("**** deq size b="+deq.size());

        Product firstElement1=deq.peekFirst();
        System.out.println("*** first element");
        demo.display(firstElement1);
        System.out.println("**** deq size after peek="+deq.size());

        Product firstElement2=deq.pollFirst();
        System.out.println("*** first element");
        demo.display(firstElement2);
        System.out.println("**** deq size after peek="+deq.size());

    }
    void display(Product product){
        System.out.println("product-"+product.getId()+"-"+product.getName());
    }

}
