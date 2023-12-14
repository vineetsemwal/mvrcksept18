package com.maveric.customerms.service;

import com.maveric.customerms.dao.CustomerDaoImpl;
import com.maveric.customerms.dao.ICustomerDao;
import com.maveric.customerms.domain.Customer;


public class CustomerServiceImpl implements ICustomerService{
    private ICustomerDao customerDao=new CustomerDaoImpl();

    private int generatedId;

    private  int generateId(){
        return ++generatedId;
    }
    @Override
    public Customer register(String name) {
    int id=generateId();
    Customer customer=new Customer(id,name);
    return customerDao.save(customer);
    }
}
