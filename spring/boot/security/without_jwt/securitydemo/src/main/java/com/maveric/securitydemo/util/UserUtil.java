package com.maveric.securitydemo.util;

import com.maveric.securitydemo.domain.AppUser;
import com.maveric.securitydemo.dto.UserDetailsImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class UserUtil {

    public UserDetails to(AppUser user){
        UserDetails details=new UserDetailsImpl(user);
        return details;
    }

}
