package com.example.giasu.Service;

import com.example.giasu.DTO.DistrictDTO;
import com.example.giasu.DTO.RespondDTO;
import com.example.giasu.Entity.District;

import java.util.List;

public interface DistrictService {
    public String create(DistrictDTO districtDTO);

    public RespondDTO<List<District>> findAll();
}
