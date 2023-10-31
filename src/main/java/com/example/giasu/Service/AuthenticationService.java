package com.example.giasu.Service;

import com.example.giasu.Auth.AuthenticationRequest;
import org.springframework.http.ResponseEntity;

public interface AuthenticationService {

    public ResponseEntity<?> authenticate(AuthenticationRequest authenticationRequest);
}
