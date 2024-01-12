package com.maveric.ecommerce.productms.service;

import com.maveric.ecommerce.productms.dtos.AddProduct;
import com.maveric.ecommerce.productms.dtos.ProductDetails;
import com.maveric.ecommerce.productms.entities.Product;
import com.maveric.ecommerce.productms.exceptions.ProductNotFoundException;
import com.maveric.ecommerce.productms.repo.IProductRepo;
import com.maveric.ecommerce.productms.utils.ProductUtil;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService{

    private ProductUtil productUtil;
    private IProductRepo repo;
    public ProductServiceImpl(IProductRepo repo, ProductUtil util){
        this.repo=repo;
        this.productUtil=util;
    }


    @Override
    public ProductDetails add(AddProduct requestData) {
        Product product=new Product();
        product.setName(requestData.getName());
        product.setPrice(requestData.getPrice());
        product=repo.save(product);
        return productUtil.toProductDetails(product);
    }

    @Override
    public ProductDetails findById(long id)throws ProductNotFoundException{
        Optional<Product>optional=repo.findById(id);
        if(optional.isEmpty()){
            throw new ProductNotFoundException("product not found");
        }
       Product product= optional.get();
       ProductDetails desired=productUtil.toProductDetails(product);
       return desired;

    }
}
