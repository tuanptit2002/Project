package com.example.giasu.Service;

import com.example.giasu.DTO.RespondDTO;
import com.example.giasu.DTO.TeachClassDTO;
import com.example.giasu.Entity.Subject;
import com.example.giasu.Entity.TeachClass;

import java.util.List;

public interface TechClassService {

    public void create(TeachClassDTO teachClassDTO);

    public RespondDTO<List<TeachClass>> findAll();
}
