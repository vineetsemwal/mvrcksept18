package com.maveric.customerms.service;

import com.maveric.customerms.dao.CustomerDaoImpl;
import com.maveric.customerms.dao.ICustomerDao;
import com.maveric.customerms.domain.Customer;

import java.util.Map;

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
    Customer saved=customerDao.save(customer);
    return saved;
    }
}
