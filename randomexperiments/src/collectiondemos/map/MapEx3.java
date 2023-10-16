package collectiondemos.map;

import collectiondemos.Product;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx3 {
    Map<Integer, Product> sortedStore = new TreeMap<>(new ProductNameComparison());
    Map<Integer, Product> backup = new HashMap<>();

    class ProductNameComparison implements Comparator<Integer> {
        @Override
        public int compare(Integer key1, Integer key2) {
            Product value1 = backup.get(key1);
            Product value2 = backup.get(key2);
            return value1.getName().compareTo(value2.getName());
        }
    }

    public static void main(String[] args) {
        MapEx3 demo = new MapEx3();
        demo.runApp();

    }

    void displayAll() {
        for (int key : sortedStore.keySet()) {
            Product value = sortedStore.get(key);
            display(value);
        }
    }

    void runApp() {
        Product samsung = new Product(3, "samsung");
        backup.put(samsung.getId(), samsung);
        Product moto = new Product(1, "moto");
        backup.put(moto.getId(), moto);
        Product iphone = new Product(5, "iphone");
        backup.put(iphone.getId(), iphone);
        sortedStore.putAll(backup);

        displayAll();


    }

    void display(Product product) {
        System.out.println("product-" + product.getId() + "-" + product.getName());
    }
}
