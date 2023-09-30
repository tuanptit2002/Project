package com.example.giasu.Service;

import com.example.giasu.DTO.CityDTO;
import com.example.giasu.DTO.RespondDTO;
import com.example.giasu.Entity.City;

import java.util.List;

public interface CityService {

    public String create(CityDTO cityDTO);

    public RespondDTO<List<City>> findAll();
}
