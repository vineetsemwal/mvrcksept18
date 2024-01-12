package com.maveric.ecommerce.productms.repo;

import com.maveric.ecommerce.productms.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepo extends JpaRepository<Product,Long> {
}
