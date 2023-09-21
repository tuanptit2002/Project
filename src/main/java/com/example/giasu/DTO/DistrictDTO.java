package com.example.giasu.DTO;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DistrictDTO {
    private String name;
    List<UserDTO> userDTOS = new ArrayList<>();
    List<ClassDTO> classDTOS = new ArrayList<>();
}
