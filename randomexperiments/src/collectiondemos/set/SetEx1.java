package collectiondemos.set;

import collectiondemos.Product;

import java.util.HashSet;
import java.util.Iterator;
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

        System.out.println("***displaying all products");
        for (Product product:products){
            demo.display(product);
        }

        System.out.println("***removing product with name iphone");
        //iterating and removing element
        Iterator<Product>iterator =products.iterator();
        while (iterator.hasNext()){
           Product iterated= iterator.next();
           if(iterated.getName().equals("iphone")) {
               iterator.remove();
           }
        }
        System.out.println("after removal size="+products.size());





    }
    void display(Product product){
        System.out.println("product-"+product.getId()+"-"+product.getName());
    }

}
