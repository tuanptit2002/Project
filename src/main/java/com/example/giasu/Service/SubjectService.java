package com.example.giasu.Service;

import com.example.giasu.DTO.RespondDTO;
import com.example.giasu.DTO.SubjectDTO;
import com.example.giasu.Entity.Subject;

import java.util.List;

public interface SubjectService {

    public void create(SubjectDTO subjectDTO);

    public RespondDTO<List<Subject>> findAll();
}
