package collectiondemos.list;

import collectiondemos.Product;

import java.util.Comparator;

public class ProductNameComparatorAscending implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        String name1=product1.getName();
        String name2= product2.getName();
        int compareResult=name1.compareTo(name2);
        return compareResult;
    }
}
