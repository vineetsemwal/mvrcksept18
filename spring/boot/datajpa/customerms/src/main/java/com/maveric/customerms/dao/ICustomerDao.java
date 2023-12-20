package com.maveric.customerms.dao;

import com.maveric.customerms.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICustomerDao extends JpaRepository<Customer,Long> {

}
