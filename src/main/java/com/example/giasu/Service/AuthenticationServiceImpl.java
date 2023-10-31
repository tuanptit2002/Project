package com.example.giasu.Service;

import com.example.giasu.Auth.AuthenticationRequest;
import com.example.giasu.Auth.AuthenticationResponse;
import com.example.giasu.Entity.Role;
import com.example.giasu.Entity.User;
import com.example.giasu.Repository.RoleCustomRepo;
import com.example.giasu.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService{
    private final UserRepository userRepository;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    private final RoleCustomRepo roleCustomRepo;


    public ResponseEntity<?> authenticate(AuthenticationRequest authenticationRequest){
        try{
                User user = userRepository.findByEmail(authenticationRequest.getEmail()).orElseThrow(() -> new NoSuchElementException("User not found"));
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getEmail(), authenticationRequest.getPassword()));
                List<Role> role = new ArrayList<>();
                if(user != null){
                    role = roleCustomRepo.getRole(user);
                }
            Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
            List<Role> roles = new ArrayList<>();
            role.stream().forEach(c -> {
                roles.add(new Role(c.getName()));
                authorities.add(new SimpleGrantedAuthority(c.getName()));
            });
            user.setRoles(roles);
            roles.stream().forEach(i -> authorities.add(new SimpleGrantedAuthority((i.getName()))));
            var jwtAccessToken = jwtService.generateToken(user,authorities);
            var jwtRefreshToken = jwtService.generateRefreshToken(user,authorities);

            return ResponseEntity.ok(AuthenticationResponse.builder().access_token(jwtAccessToken).refresh_token(jwtRefreshToken).email(user.getEmail()).user_name(user.getUsername()).build());
        }catch (NoSuchElementException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }catch (BadCredentialsException e){
            return ResponseEntity.badRequest().body("Invalid Credential");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
        }
    }
}
