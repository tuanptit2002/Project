package com.example.giasu.DTO;

import lombok.Data;

import java.util.List;

@Data
public class MajoredDTO {
    private String name;

    List<UserDTO> userDTOS;
}
