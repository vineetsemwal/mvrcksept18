package com.maveric.customerms.service;

import com.maveric.customerms.CustomerUtil;
import com.maveric.customerms.dao.ICustomerDao;
import com.maveric.customerms.domain.Account;
import com.maveric.customerms.domain.Customer;
import com.maveric.customerms.dto.CreateCustomerRequest;
import com.maveric.customerms.dto.CustomerResponse;
import com.maveric.customerms.exceptions.CustomerNotFoundException;
import com.maveric.customerms.exceptions.InvalidCustomerNameException;
import com.maveric.customerms.exceptions.InvalidIDException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class CustomerServiceImpl implements ICustomerService {
    private ICustomerDao customerDao;
    private CustomerUtil util;

    public CustomerServiceImpl(ICustomerDao dao, CustomerUtil util) {
        this.customerDao = dao;
        this.util = util;
    }

    @Transactional
    @Override
    public CustomerResponse register(CreateCustomerRequest request) throws InvalidCustomerNameException {
        if (request.getName() == null || request.getName().isBlank()) {
            throw new InvalidCustomerNameException("invalid custoemr name");
        }
        Customer customer = util.from(request);
        //Account account=customer.getAccount();
        customer = customerDao.save(customer);
        CustomerResponse response = util.from(customer);
        return response;
    }

    @Transactional(readOnly = true)
    @Override
    public CustomerResponse findById(long id) throws CustomerNotFoundException, InvalidIDException {
        if (id < 1) {
            throw new InvalidIDException("id is invalid");
        }
        Optional<Customer> optional = customerDao.findById(id);
        if (optional.isEmpty()) {
            throw new CustomerNotFoundException("customer nbot found");
        }
        Customer customer = optional.get();
        CustomerResponse response = util.from(customer);
        return response;
    }

    @Override
    public List<CustomerResponse> findCustomersByName(String name) {
        List<Customer> list = customerDao.findByName(name);
        //return list.stream().map(customer -> util.from(customer))
        //        .toList();
        List<CustomerResponse>desiredList=new ArrayList<>();
        for (Customer customer:list){
            CustomerResponse desired=util.from(customer);
            desiredList.add(desired);
        }
        return desiredList;
    }
}
