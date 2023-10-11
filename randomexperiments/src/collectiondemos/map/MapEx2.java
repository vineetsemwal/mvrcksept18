package collectiondemos.map;

import collectiondemos.Product;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapEx2 {
    public static void main(String[] args) {
        MapEx2 demo=new MapEx2();
        Map<Integer, Product> store=new TreeMap<>(new IdKeyComparator());
        Product samsung=new Product(3,"samsung");
        store.put(samsung.getId(),samsung);
        Product moto=new Product(1,"moto");
        store.put(moto.getId(),moto);
        Product iphone=new Product(5,"iphone");
        store.put(iphone.getId(),iphone);

        boolean entryWithKey1Exists=store.containsKey(1);
        System.out.println("key 1 exist="+entryWithKey1Exists);
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
        for (var entry:entries ){
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
