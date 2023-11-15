package com.maveric.designpatterns.iterator;

import com.maveric.designpatterns.facade.Product;

import java.util.ArrayList;
import java.util.List;

public class IteratorUse {
    private List<Product> store = new ArrayList<>();
    public IteratorUse(){
        store.add(new Product(1,"iphone"));
        store.add(new Product(2, "motorola"));
    }


    List<Product> fetchAll() {
        return store;
    }

    public static void main(String[] args) {
     IteratorUse demo=new IteratorUse();
     demo.runApp();

    }
    void runApp(){
        Client client=new Client();
        client.displayProducts();
    }

    class Client {

        void displayProducts() {
            Product samsung=new Product(5,"samsung");
            List<Product> products = fetchAll();
            products.add(samsung);
            for (Product product : products) {
                System.out.println("product="+product.getId()+"-"+product.getName());
            }
        }

    }

}
