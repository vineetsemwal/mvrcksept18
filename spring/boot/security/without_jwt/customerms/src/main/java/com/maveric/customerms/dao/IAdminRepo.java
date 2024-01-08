package com.maveric.customerms.dao;

import com.maveric.customerms.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin,Long> {
}
