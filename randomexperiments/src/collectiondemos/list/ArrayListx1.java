package collectiondemos.list;

import collectiondemos.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListx1 {
    public static void main(String[] args) {
        ArrayListx1 demo=new ArrayListx1();
        List<Product> list = new ArrayList<>();
        list.add(new Product(3, "iphone"));
        list.add(new Product(1, "moto"));
        list.add(new Product(2, "samsung"));
        list.add(0,new Product(4,"htc"));
        Product productIndex1=list.get(1);
        System.out.println("***product at index 1");
        demo.display(productIndex1);

        Product checkFor=new Product(1,"moto");
        boolean exists=list.contains(checkFor);
        System.out.println("*** checking if product with id 1 exists");
        System.out.println("exists="+exists);

        System.out.println("****checking collection size");
        System.out.println(list.size());
        System.out.println("element at index 0 removed");
        list.remove(0);
        System.out.println("****checking collection size");
        System.out.println(list.size());
        System.out.println("******display all products");
        for (Product iterated:list){
            demo.display(iterated);
        }

       // Collections.sort(list);
       // list.sort(new ProductNameComparatorDescending());
        Comparator<Product>nameComparator=(product1,product2)->{
            String name1=product1.getName();
            String name2= product2.getName();
            int compareResult=name2.compareTo(name1);
            return compareResult;
        };
        list.sort(nameComparator);
        System.out.println("***displaying list after sorting on id");
        for (Product iterated:list){
            demo.display(iterated);
        }


    }
    void display(Product product){
        System.out.println("product-"+product.getId()+"-"+product.getName());
    }

}
