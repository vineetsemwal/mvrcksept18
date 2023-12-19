package com.maveric.customerms.service;

import com.maveric.customerms.dao.CustomerDaoImpl;
import com.maveric.customerms.dao.ICustomerDao;
import com.maveric.customerms.domain.Customer;
import com.maveric.customerms.exceptions.CustomerNotFoundException;
import com.maveric.customerms.exceptions.InvalidCustomerNameException;
import com.maveric.customerms.exceptions.InvalidIDException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class CustomerServiceImpl implements ICustomerService{
    private ICustomerDao customerDao;

    public CustomerServiceImpl(ICustomerDao dao){
        this.customerDao=dao;
    }

    @Transactional
    @Override
    public Customer register(String name) throws InvalidCustomerNameException {
    if(name==null||name.isBlank()){
        throw new InvalidCustomerNameException("invalid custoemr name");
    }
    Customer customer=new Customer();
    customer.setName(name);
    return customerDao.save(customer);
    }


    @Transactional(readOnly = true)
    @Override
    public Customer findById(long id) throws CustomerNotFoundException, InvalidIDException {
        if(id<1){
            throw new InvalidIDException("id is invalid");
        }
      Optional<Customer>optional= customerDao.findById(id);
      if(optional.isEmpty()){
          throw new CustomerNotFoundException("customer nbot found");
      }
      return optional.get();
    }

}
