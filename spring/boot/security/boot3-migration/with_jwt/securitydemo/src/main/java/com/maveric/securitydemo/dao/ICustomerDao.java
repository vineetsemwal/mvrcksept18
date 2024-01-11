package com.maveric.securitydemo.dao;

import com.maveric.securitydemo.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICustomerDao extends JpaRepository<Customer,Long> {
  /*
       TypedQuery<Customer>query=em.createQuery("from Customer where name=:name",Customer.class)
      List<Customer>list =query.getList();
   */
    List<Customer> findByName(String customerName);

    @Query("from Customer where name=:nameParam and age=:ageParam")
    List<Customer>fetchByNameAndAge(@Param("nameParam") String name,@Param("ageParam") int age);

    //finds all customers where balance is greater than minimum balance
    @Query("from Customer cmr join cmr.account acc where acc.balance> :minBalance")
    List<Customer> findByCustomersWithBalanceGreaterThan(@Param("minBalance") double minBalance);


//finds all customer with a particular balance
  List<Customer> findByAccount_Balance(double balance);

}
