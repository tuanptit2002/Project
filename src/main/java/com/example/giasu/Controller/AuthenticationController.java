package com.example.giasu.Controller;

import com.example.giasu.Auth.AuthenticationRequest;
import com.example.giasu.DTO.UserDTO;
import com.example.giasu.Service.AuthenticationService;
import com.example.giasu.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
//@CrossOrigin(origins = "*")
public class AuthenticationController {
    @Autowired
    UserService userService;
    private final AuthenticationService authenticationService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthenticationRequest authenticationRequest){
        return ResponseEntity.ok(authenticationService.authenticate(authenticationRequest));
    }
    @PostMapping("/singup")
    public void singUp(@RequestBody UserDTO userDTO){
        userService.singup(userDTO);
    }
}
