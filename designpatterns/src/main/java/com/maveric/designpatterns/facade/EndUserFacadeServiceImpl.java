package com.maveric.designpatterns.facade;

public class EndUserFacadeServiceImpl implements IEndUserService{
    private ICustomerService customerService;
    private IProductService productService;

    public EndUserFacadeServiceImpl(ICustomerService customerService,IProductService productService){
        this.customerService=customerService;
        this.productService=productService;
    }

    @Override
    public Product findProductById(long id) {
        return productService.findById(id);
    }

    @Override
    public Customer findCustomerById(long id) {
        return customerService.findById(id);
    }
}
