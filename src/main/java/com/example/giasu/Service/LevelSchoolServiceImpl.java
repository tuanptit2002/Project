package com.example.giasu.Service;

import com.example.giasu.DTO.RespondDTO;
import com.example.giasu.Entity.LevelSchool;
import com.example.giasu.Repository.LevelSchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LevelSchoolServiceImpl implements LevelSchoolService {

    @Autowired
    LevelSchoolRepository levelSchoolRepository;

    @Override
    public RespondDTO<List<LevelSchool>> findAll(){
        List<LevelSchool> levelSchools = levelSchoolRepository.findAll();
        RespondDTO<List<LevelSchool>> respondDTO = new RespondDTO<>();
        respondDTO.setResult(levelSchools);
        return respondDTO;
    }
}
