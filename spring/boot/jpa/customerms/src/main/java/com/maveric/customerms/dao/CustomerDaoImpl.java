package com.maveric.customerms.dao;

import com.maveric.customerms.domain.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public class CustomerDaoImpl implements ICustomerDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Customer save(Customer customer) {
        entityManager.persist(customer);
        return customer;
    }

    @Override
    public Optional<Customer> findById(long id) {
        Customer customer= entityManager.find(Customer.class,id);
        return Optional.ofNullable(customer);
    }
}
