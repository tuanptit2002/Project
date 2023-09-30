package com.example.giasu.Controller;

import com.example.giasu.DTO.RespondDTO;
import com.example.giasu.Entity.LevelSchool;
import com.example.giasu.Service.LevelSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v1/level-school")
public class LevelSchoolController {

    @Autowired
    LevelSchoolService levelSchoolService;

    @PostMapping("/find-all")
    public RespondDTO<List<LevelSchool>> findAll(){
        return levelSchoolService.findAll();
    }
}
