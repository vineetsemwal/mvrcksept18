package com.maveric.securitydemo.util;

import com.maveric.securitydemo.domain.Admin;
import com.maveric.securitydemo.dto.AdminResponse;
import org.springframework.stereotype.Component;

@Component
public class AdminUtil {

    public AdminResponse toResponse(Admin admin){
        AdminResponse response=new AdminResponse();
        response.setId(admin.getId());
        response.setUsername(admin.getUser().getUsername());
        return response;
    }

}
