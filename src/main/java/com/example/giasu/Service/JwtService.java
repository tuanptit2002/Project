package com.example.giasu.Service;

import com.example.giasu.Entity.User;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;

public interface JwtService {
    public String generateToken(User user, Collection<SimpleGrantedAuthority> authorities);
    public String generateRefreshToken(User user, Collection<SimpleGrantedAuthority> authorities);

}
