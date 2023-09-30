package com.example.giasu.Controller;

import com.example.giasu.DTO.CityDTO;
import com.example.giasu.DTO.RespondDTO;
import com.example.giasu.DTO.SuccessDTO;
import com.example.giasu.Entity.City;
import com.example.giasu.Entity.Subject;
import com.example.giasu.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v1/city")
public class CityController {

    @Autowired
    CityService cityService;

    @PostMapping("/create")
    public SuccessDTO<String> create(@RequestBody CityDTO cityDTO) {

        cityService.create(cityDTO);
        return new SuccessDTO<>("Thành công");
    }

    @PostMapping("/find-all")
    public RespondDTO<List<City>> findAll(){
        return cityService.findAll();
    }
}
