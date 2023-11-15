package com.maveric.designpatterns.facade;

public interface IProductService {
    Product add(String name);

    Product findById(long id);

    Product update(Product product);
}
