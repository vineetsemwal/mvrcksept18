package com.maveric.securitydemo.dao;

import com.maveric.securitydemo.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin,Long> {
}
