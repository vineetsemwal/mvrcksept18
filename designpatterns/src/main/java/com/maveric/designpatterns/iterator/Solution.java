package com.maveric.designpatterns.iterator;

import com.maveric.designpatterns.facade.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
    private List<Product> store = new ArrayList<>();
    public Solution(){
        store.add(new Product(1,"iphone"));
        store.add(new Product(2, "motorola"));
    }


    Iterator<Product> fetchAll() {
        return store.iterator();
    }

    public static void main(String[] args) {
     Solution demo=new Solution();
     demo.runApp();

    }
    void runApp(){
        Client client=new Client();
        client.displayProducts();
    }

    class Client {

        void displayProducts() {
            //Product samsung=new Product(5,"samsung");
            Iterator<Product> products = fetchAll();
          //  products.add(samsung);
            while (products.hasNext()) {
                Product product=products.next();
                System.out.println("product="+product.getId()+"-"+product.getName());
            }
        }

    }

}
