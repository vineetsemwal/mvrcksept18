package com.maveric.designpatterns.facade;

public interface ICustomerService {
    Customer register(String name);

   Customer findById(long id);

   Customer update(Customer customer);

}
