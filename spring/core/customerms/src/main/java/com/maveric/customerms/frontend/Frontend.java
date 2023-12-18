package com.maveric.customerms.frontend;

import com.maveric.customerms.domain.Customer;
import com.maveric.customerms.service.CustomerServiceImpl;
import com.maveric.customerms.service.ICustomerService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Frontend {

    ICustomerService service = new CustomerServiceImpl();

    public static void main(String[] args) {
        Frontend frontend = new Frontend();
        String result1 = frontend.registerAndDisplay("rahul");
        System.out.println(result1);
        String result2 = frontend.registerAndDisplay("govind");
        System.out.println(result2);
    }

    public String registerAndDisplay(String name) {
        Customer customer = service.register(name);
        String text = "Customer-" + customer.getId() + "-" + customer.getName();
        return text;
    }

}

