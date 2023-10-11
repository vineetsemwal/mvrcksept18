package collectiondemos.map;

import collectiondemos.Product;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MapEx3 {
    Map<Integer, Product> store = new TreeMap<>(new ProductNameComparison());

    class ProductNameComparison implements Comparator<Integer> {
        @Override
        public int compare(Integer key1, Integer key2) {
            Product value1 = store.get(key1);
            Product value2 = store.get(key2);

            System.out.println("key1=" + key1 + "value1=" + value1);
            System.out.println("key2=" + key2 + "value2=" + value2);
            return value1.getName().compareTo(value2.getName());
        }
    }

    public static void main(String[] args) {
        MapEx3 demo = new MapEx3();
        demo.runApp();

    }

    void displayAll() {
        for (int key : store.keySet()) {
            Product value = store.get(key);
            display(value);
        }
    }

    void runApp() {
        Product samsung = new Product(3, "samsung");
        store.put(samsung.getId(), samsung);
        Product moto = new Product(1, "moto");
        store.put(moto.getId(), moto);
        Product iphone = new Product(5, "iphone");
        store.put(iphone.getId(), iphone);
        displayAll();

    }

    void display(Product product) {
        System.out.println("product-" + product.getId() + "-" + product.getName());
    }
}
