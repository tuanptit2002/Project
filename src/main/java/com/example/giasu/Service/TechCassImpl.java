package com.example.giasu.Service;

import com.example.giasu.DTO.RespondDTO;
import com.example.giasu.DTO.TeachClassDTO;
import com.example.giasu.Entity.TeachClass;
import com.example.giasu.Repository.TeachClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TechCassImpl implements TechClassService{

    @Autowired
    TeachClassRepository teachClassRepository;
    @Override
    public void create(TeachClassDTO teachClassDTO){
        TeachClass teachClass = new TeachClass();
        teachClass.setClassroom(teachClassDTO.getClassroom());
        teachClassRepository.save(teachClass);
    }

    @Override
    public RespondDTO<List<TeachClass>> findAll(){
        List<TeachClass> teachClasses = teachClassRepository.findAll();
        RespondDTO<List<TeachClass>> respondDTO = new RespondDTO<>();
        respondDTO.setResult(teachClasses);
        return respondDTO;
    }

}
