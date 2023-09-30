package com.example.giasu.Service;

import com.example.giasu.DTO.RespondDTO;
import com.example.giasu.Entity.LevelSchool;

import java.util.List;

public interface LevelSchoolService {

    public RespondDTO<List<LevelSchool>> findAll();
}
