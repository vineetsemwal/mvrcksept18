package com.maveric.securitydemo.service;

import com.maveric.securitydemo.dto.AdminResponse;
import com.maveric.securitydemo.dto.RegisterAdminRequest;

public interface IAdminService {

   AdminResponse register(RegisterAdminRequest request);

}
