package com.example.giasu.DTO;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TeachClassDTO {
    private String classroom;

    List<UserDTO> userDTOS = new ArrayList<>();
}
