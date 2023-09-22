package com.example.giasu.Service;

import com.example.giasu.DTO.TeachClassDTO;
import com.example.giasu.Entity.TeachClass;
import com.example.giasu.Repository.TeachClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechCassImpl implements TechClassService{

    @Autowired
    TeachClassRepository teachClassRepository;
    public void create(TeachClassDTO teachClassDTO){
        TeachClass teachClass = new TeachClass();
        teachClass.setClassroom(teachClassDTO.getClassroom());
        teachClassRepository.save(teachClass);
    }
}
