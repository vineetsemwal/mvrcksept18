package com.maveric.securitydemo.service;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends UserDetailsService {
    String login(String username, String password);
}
