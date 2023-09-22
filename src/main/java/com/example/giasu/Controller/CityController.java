package com.example.giasu.Controller;

import com.example.giasu.DTO.CityDTO;
import com.example.giasu.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/city")
public class CityController {

    @Autowired
    CityService cityService;

    @PostMapping("/create")
    public String create(@RequestBody CityDTO cityDTO){
        return cityService.create(cityDTO);
    }
}
