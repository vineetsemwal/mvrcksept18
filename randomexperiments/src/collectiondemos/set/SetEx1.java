package collectiondemos.set;

import collectiondemos.list.Product;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        SetEx1 demo=new SetEx1();
        Set<Product>products=new HashSet<>();
        products.add(new Product(3,"samsung"));
        products.add(new Product(1,"moto"));
        products.add(new Product(5,"iphone"));
        products.add(new Product(5,"iphone"));
        System.out.println("size="+products.size());
        for (Product iterated:products){
            demo.display(iterated);
        }



    }
    void display(Product product){
        System.out.println("product-"+product.getId()+"-"+product.getName());
    }

}
