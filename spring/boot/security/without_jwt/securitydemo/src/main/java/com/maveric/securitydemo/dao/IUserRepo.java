package com.maveric.securitydemo.dao;

import com.maveric.securitydemo.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<AppUser,String> {
}
