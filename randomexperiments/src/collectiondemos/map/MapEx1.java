package collectiondemos.map;

import collectiondemos.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        MapEx1 demo=new MapEx1();
        Map<Integer, Product>store=new HashMap<>();
        Product samsung=new Product(3,"samsung");
        store.put(samsung.getId(),samsung);
        Product moto=new Product(1,"moto");
        store.put(moto.getId(),moto);
        Product iphone=new Product(5,"iphone");
        store.put(iphone.getId(),iphone);

        System.out.println("***find the value by key 1");
        Product foundWithKey1=store.get(1);
        demo.display(foundWithKey1);

        System.out.println("**** iterating keys");
        Set<Integer> keys=store.keySet();
        for (Integer key:keys){
            Product iterated=store.get(key);
            System.out.println("key="+key);
            demo.display(iterated);
        }

        System.out.println("**** iterating entries");
        Set<Map.Entry<Integer,Product>>entries=store.entrySet();
        for (Map.Entry<Integer,Product>entry:entries ){
            System.out.println("key="+entry.getKey());
            Product value=entry.getValue();
            demo.display(value);
        }
        System.out.println("store size before removal="+store.size());
        store.remove(1);
        System.out.println("*** store size after removing entry with key 1="+store.size());


    }
    void display(Product product){
        System.out.println("product-"+product.getId()+"-"+product.getName());
    }
}
