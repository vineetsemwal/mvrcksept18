package com.maveric.ecommerce.orderms.repo;

import com.maveric.ecommerce.orderms.entities.CreatedOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IOrderRepository extends JpaRepository<CreatedOrder,Long> {

    List<CreatedOrder>findByCustomerId(long customerId);

}
