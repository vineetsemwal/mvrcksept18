package com.maveric.securitydemo.service;

import com.maveric.securitydemo.dao.IAdminRepo;
import com.maveric.securitydemo.domain.Admin;
import com.maveric.securitydemo.domain.AppUser;
import com.maveric.securitydemo.dto.AdminResponse;
import com.maveric.securitydemo.dto.RegisterAdminRequest;
import com.maveric.securitydemo.util.AdminUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
public class AdminServiceImpl implements IAdminService{
    private IAdminRepo adminRepo;
    private AdminUtil util;
    public AdminServiceImpl(IAdminRepo repo, AdminUtil util){
        this.adminRepo=repo;
        this.util=util;
    }

    @Transactional
    @Override
    public AdminResponse register(RegisterAdminRequest request) {
        Admin admin=new Admin();
        Set<String> roles=new HashSet<>();
        roles.add("ADMIN");
        AppUser user=new AppUser(request.getUsername(), request.getPassword(),roles);
        admin.setUser(user);
        admin=adminRepo.save(admin);
        return util.toResponse(admin);
    }
}
