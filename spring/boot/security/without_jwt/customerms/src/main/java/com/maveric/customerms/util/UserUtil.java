package com.maveric.customerms.util;

import com.maveric.customerms.domain.AppUser;
import com.maveric.customerms.dto.UserDetailsImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class UserUtil {

    public UserDetails to(AppUser user){
        UserDetails details=new UserDetailsImpl(user);
        return details;
    }

}
