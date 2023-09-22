package com.example.giasu.Service;

import com.example.giasu.DTO.DistrictDTO;
import com.example.giasu.Entity.City;
import com.example.giasu.Entity.District;
import com.example.giasu.Repository.CityRepository;
import com.example.giasu.Repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistrictServiceImpl implements DistrictService{

    @Autowired
    DistrictRepository districtRepository;

    @Autowired
    CityRepository cityRepository;
    @Override
    public String create(DistrictDTO districtDTO) {
        District district = new District();
        district.setName(districtDTO.getName());
        City city = cityRepository.findByName(districtDTO.getCityDTO());
        district.setCity(city);
        districtRepository.save(district);
        return "thanh cong";
    }
}
