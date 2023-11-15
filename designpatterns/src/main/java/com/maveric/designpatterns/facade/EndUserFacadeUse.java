package com.maveric.designpatterns.facade;

public class EndUserFacadeUse {
    public static void main(String[] args) {
        IProductService productService=new ProductServiceImpl();
        ICustomerService customerService=new CustomerServiceImpl();
        IEndUserService service=new EndUserFacadeServiceImpl(customerService,productService);
        Customer customer=service.findCustomerById(1);
        Product product=service.findProductById(10);
        System.out.println("customer="+customer.getId()+"-"+customer.getName());
        System.out.println("product="+product.getId()+"-"+product.getName());
    }
}
