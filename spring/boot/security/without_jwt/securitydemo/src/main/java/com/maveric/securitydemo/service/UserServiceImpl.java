package com.maveric.securitydemo.service;

import com.maveric.securitydemo.dao.IUserRepo;
import com.maveric.securitydemo.domain.AppUser;
import com.maveric.securitydemo.util.UserUtil;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserDetailsService {

    private IUserRepo userRepo;
    private UserUtil userUtil;

    public UserServiceImpl(IUserRepo userRepo, UserUtil util) {
        this.userRepo = userRepo;
        this.userUtil = util;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AppUser> optional = userRepo.findById(username);
        if (optional.isEmpty()) {
            throw new UsernameNotFoundException("username not found");
        }
        AppUser user = optional.get();
        UserDetails userDetails = userUtil.to(user);
        return userDetails;
    }
}
