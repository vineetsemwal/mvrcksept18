package collectiondemos.list;

import collectiondemos.Product;

import java.util.Comparator;

public class ProductNameComparatorDescending implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        String name1=product1.getName();
        String name2= product2.getName();
        int compareResult=name2.compareTo(name1);
        return compareResult;
    }
}
