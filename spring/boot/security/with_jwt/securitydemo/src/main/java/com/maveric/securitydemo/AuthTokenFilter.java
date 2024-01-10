package com.maveric.securitydemo;

import com.maveric.securitydemo.service.IUserService;
import com.maveric.securitydemo.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AuthTokenFilter extends OncePerRequestFilter {

    @Autowired
    private TokenUtil tokenUtil;

    @Autowired
    private IUserService userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        String uri = request.getRequestURI();
        System.out.println("****uri="+uri);
        if (uri.startsWith("/p/") || uri.equals("/login")) {
            filterChain.doFilter(request, response);
            return;
        }

        String token = request.getHeader("Authorization");
        if(token==null||token.isBlank()||token.length()<8){
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            response.getWriter().write("incorrect credentials");
            return;
        }
        token = token.substring(7);
        String username = tokenUtil.fetchUsernameByDecodingToken(token);
        UserDetails user=userService.loadUserByUsername(username);
        SecurityContext securityContext = SecurityContextHolder.getContext();
        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(username,null,user.getAuthorities());
        securityContext.setAuthentication(auth);
        filterChain.doFilter(request, response);
    }
}
