package com.example.giasu.DTO;

import com.example.giasu.Entity.City;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DistrictDTO {
    private String name;
    List<UserDTO> userDTOS = new ArrayList<>();
    List<ClassDTO> classDTOS = new ArrayList<>();
    private String cityDTO;
}
