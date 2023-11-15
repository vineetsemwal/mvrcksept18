package com.maveric.designpatterns.facade;

import java.util.HashMap;
import java.util.Map;

public class ProductServiceImpl implements IProductService{

    private Map<Long,Product>store=new HashMap<>();

    private long generatedId;
    private long generateId(){
        return ++generatedId;
    }

    public ProductServiceImpl(){
        store.put(10l,new Product(10,"samsung"));
        store.put(11l,new Product(11,"motorola"));
    }

    @Override
    public Product add(String name) {
        long newId=generateId();
        Product product=new Product(newId,name);
        store.put(newId,product);
        return product;
    }

    @Override
    public Product findById(long id) {
        return store.get(id);
    }

    @Override
    public Product update(Product product) {
        store.replace(product.getId(),product);
        return product;
    }
}
