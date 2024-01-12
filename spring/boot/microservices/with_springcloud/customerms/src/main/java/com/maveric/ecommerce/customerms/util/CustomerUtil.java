package com.maveric.ecommerce.customerms.util;

import com.maveric.ecommerce.customerms.domain.Account;
import com.maveric.ecommerce.customerms.domain.Customer;
import com.maveric.ecommerce.customerms.dto.CreateCustomerRequest;
import com.maveric.ecommerce.customerms.dto.CustomerResponse;
import com.maveric.ecommerce.customerms.dto.ProductDetails;
import com.maveric.ecommerce.customerms.service.IProductApiUse;
import org.springframework.beans.BeanUtils;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.function.Function;
import java.util.function.Supplier;

@Component
public class CustomerUtil {

    private ProductDetails cachedCheapestProduct;


    private CircuitBreakerFactory cbFactory;

    private IProductApiUse productApi;

    public CustomerUtil(CircuitBreakerFactory cbFactory, IProductApiUse productApi) {
        this.cbFactory = cbFactory;
        this.productApi = productApi;
    }


    public String method() {
        String msg1 = "hello";
        String msg2 = "bye";
        return msg1;
    }

    public Customer from(CreateCustomerRequest request) {
        Customer desired = new Customer();
        BeanUtils.copyProperties(request, desired);
        Account account = new Account();
        account.setBalance(request.getBalance());
        desired.setAccount(account);
        return desired;
    }

    public CustomerResponse from(Customer customer) {
        Account account = customer.getAccount();
        CustomerResponse desired = new CustomerResponse();
        BeanUtils.copyProperties(customer, desired);
        desired.setCustomerId(customer.getId());
        desired.setAccountId(account.getId());
        desired.setBalance(account.getBalance());
        return desired;
    }

    public ProductDetails fetchCheapestProduct() {
        CircuitBreaker circuitBreaker = cbFactory.create("productms-cheap");
        Supplier<ProductDetails> supplier = () -> {
            ProductDetails product = productApi.fetchCheapestProduct();
            cachedCheapestProduct = product;
            return product;
        };
        Function<Throwable, ProductDetails> fallback = exception -> {
            exception.printStackTrace();
            return cachedCheapestProduct;
        };

        ProductDetails result = circuitBreaker.run(supplier, fallback);
        return result;
    }

    public String experiment() {
        CircuitBreaker circuitBreaker = cbFactory.create("experiment");
        Supplier<String> supplier = () -> {
            try {
                return "Original Result";
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        };
        Function<Throwable, String> fallback = exception -> "result from fallback";
        String result = circuitBreaker.run(supplier, fallback);
        return result;
    }


}
