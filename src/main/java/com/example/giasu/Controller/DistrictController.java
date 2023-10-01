package com.example.giasu.Controller;

import com.example.giasu.DTO.RespondDTO;
import com.example.giasu.Entity.District;
import com.example.giasu.Service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v1/district")
public class DistrictController {

    @Autowired
    DistrictService districtService;

    @PostMapping("/find-all")
    public RespondDTO<List<District>> findAll(){
        return districtService.findAll();
    }

    @PostMapping("/find-district-to-city")
    public RespondDTO<List<District>> findDistrictToCity(@RequestParam Long id){
        return districtService.findDistrictToCity(id);
    }
}
