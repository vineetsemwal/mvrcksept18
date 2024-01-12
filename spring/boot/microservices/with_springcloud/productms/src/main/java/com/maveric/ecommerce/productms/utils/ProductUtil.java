package com.maveric.ecommerce.productms.utils;

import com.maveric.ecommerce.productms.dtos.ProductDetails;
import com.maveric.ecommerce.productms.entities.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ProductUtil {

    public ProductDetails toProductDetails(Product product){
        ProductDetails productDetails= new ProductDetails();
        BeanUtils.copyProperties(product,productDetails);
        return productDetails;
    }

}
