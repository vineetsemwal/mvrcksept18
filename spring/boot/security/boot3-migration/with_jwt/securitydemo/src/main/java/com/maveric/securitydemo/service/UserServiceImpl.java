package com.maveric.securitydemo.service;

import com.maveric.securitydemo.dao.IUserRepo;
import com.maveric.securitydemo.domain.AppUser;
import com.maveric.securitydemo.util.TokenUtil;
import com.maveric.securitydemo.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    private IUserRepo userRepo;
    private UserUtil userUtil;

    @Autowired
    private ApplicationContext context;

    private AuthenticationManager _authenticationManager;


    public AuthenticationManager getAuthenticationManager() {
        if (_authenticationManager != null) {
            return _authenticationManager;
        }
        _authenticationManager = context.getBean(AuthenticationManager.class);
        return _authenticationManager;
    }

    private TokenUtil tokenUtil;

    public UserServiceImpl(IUserRepo userRepo, UserUtil util, TokenUtil tokenUtil) {
        this.userRepo = userRepo;
        this.userUtil = util;
        this.tokenUtil = tokenUtil;

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

    @Override
    public String login(String username, String password) {
        System.out.println("***inside service login");
        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(username, password);
        getAuthenticationManager().authenticate(auth);
        String token = tokenUtil.createToken(username);
        System.out.println("token=" + token);

        return token;
    }

}
