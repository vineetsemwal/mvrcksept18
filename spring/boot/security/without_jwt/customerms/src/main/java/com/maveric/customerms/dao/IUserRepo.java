package com.maveric.customerms.dao;

import com.maveric.customerms.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<AppUser,String> {
}
