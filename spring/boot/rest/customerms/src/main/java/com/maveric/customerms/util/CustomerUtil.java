package com.maveric.customerms.util;

import com.maveric.customerms.domain.Account;
import com.maveric.customerms.domain.Customer;
import com.maveric.customerms.dto.CreateCustomerRequest;
import com.maveric.customerms.dto.CustomerResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CustomerUtil {

    public String method(){
        String msg1="hello";
        String msg2="bye";
        return msg1;
    }
    public Customer from(CreateCustomerRequest request){
        Customer desired=new Customer();
        BeanUtils.copyProperties(request,desired);
        Account account=new Account();
        account.setBalance(request.getBalance());
        desired.setAccount(account);
        return desired;
    }

    public CustomerResponse from(Customer customer){
        Account account=customer.getAccount();
        CustomerResponse desired=new CustomerResponse();
        BeanUtils.copyProperties(customer,desired);
        desired.setCustomerId(customer.getId());
        desired.setAccountId(account.getId());
        desired.setBalance(account.getBalance());
        return desired;
    }

}
