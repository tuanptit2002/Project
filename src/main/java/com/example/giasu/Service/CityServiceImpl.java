package com.example.giasu.Service;

import com.example.giasu.DTO.CityDTO;
import com.example.giasu.DTO.DistrictDTO;
import com.example.giasu.Entity.City;
import com.example.giasu.Entity.District;
import com.example.giasu.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityServiceImpl implements CityService{

    @Autowired
    CityRepository cityRepository;

    @Autowired
    DistrictService districtService;

    @Override
    public String create(CityDTO cityDTO){
        City city = new City();
        city.setName(cityDTO.getName());
        City city1 =cityRepository.save(city);
        for(String district : cityDTO.getDistrictDTOS()){
            DistrictDTO districtDTO = new DistrictDTO();
            districtDTO.setName(district);
            districtDTO.setCityDTO(city1.getName());
            districtService.create(districtDTO);
        }
       return "thanh cong";
    }
}
