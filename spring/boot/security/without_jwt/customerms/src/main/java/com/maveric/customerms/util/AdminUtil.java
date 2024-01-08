package com.maveric.customerms.util;

import com.maveric.customerms.domain.Admin;
import com.maveric.customerms.dto.AdminResponse;
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
