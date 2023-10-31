package com.example.giasu.Service;

import com.example.giasu.DTO.RespondDTO;
import com.example.giasu.DTO.UserDTO;
import com.example.giasu.Entity.User;

public interface UserService {
    public void createTutor(UserDTO userDTO);
    public void createFindTutor(UserDTO userDTO);

    void singup(UserDTO userDTO);
}
