package com.example.giasu.Controller;

import com.example.giasu.DTO.RespondDTO;
import com.example.giasu.DTO.SuccessDTO;
import com.example.giasu.DTO.TeachClassDTO;
import com.example.giasu.Entity.Subject;
import com.example.giasu.Entity.TeachClass;
import com.example.giasu.Service.TechClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v1/teach-class")
public class TechClassController {

    @Autowired
    TechClassService techClassService;
    @PostMapping("/create")
    public SuccessDTO<String> create(@RequestBody TeachClassDTO teachClassDTO){
        techClassService.create(teachClassDTO);
        return new SuccessDTO<>("Thành công");
    }

    @PostMapping("/find-all")
    public RespondDTO<List<TeachClass>> findAll(){
        return techClassService.findAll();
    }
}
