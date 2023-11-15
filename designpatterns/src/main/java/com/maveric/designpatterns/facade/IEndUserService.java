package com.maveric.designpatterns.facade;

public interface IEndUserService {

    Product findProductById(long id);

    Customer findCustomerById(long id);


}
