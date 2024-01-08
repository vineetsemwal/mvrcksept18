package com.maveric.customerms.service;

import com.maveric.customerms.dto.AdminResponse;
import com.maveric.customerms.dto.RegisterAdminRequest;

public interface IAdminService {

   AdminResponse register(RegisterAdminRequest request);

}
