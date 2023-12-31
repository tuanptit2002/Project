package com.example.giasu.Controller;

import com.example.giasu.DTO.SuccessDTO;
import com.example.giasu.DTO.UserDTO;
import com.example.giasu.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/create")
    public SuccessDTO<String> create(@RequestBody UserDTO userDTO) {
         userService.createTutor(userDTO);
         return new SuccessDTO<>("Thành công");
    }

}

