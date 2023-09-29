package com.example.giasu.DTO;

import com.example.giasu.Entity.District;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CityDTO {
    private String name;
    private List<String> districtDTOS = new ArrayList<>();
}
