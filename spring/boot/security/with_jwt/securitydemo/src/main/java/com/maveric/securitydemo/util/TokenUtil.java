package com.maveric.securitydemo.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class TokenUtil {
    private static final Key KEY= Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public String createToken(String username){
     long currentTime=System.currentTimeMillis();
     long expirationMillis=currentTime+(60*60*24*1000);
     String token=   Jwts.builder()
             .signWith(KEY)
             .setSubject(username)
             .setExpiration(new Date(expirationMillis))
             .compact();
     return token;
    }

    public String fetchUsernameByDecodingToken(String token){
        Jws<Claims> claimsHolder  =  Jwts.parserBuilder()
                .setSigningKey(KEY)
                .build()
                .parseClaimsJws(token);
       Claims claims= claimsHolder.getBody();
       String username=claims.getSubject();
       return username;
    }

}
