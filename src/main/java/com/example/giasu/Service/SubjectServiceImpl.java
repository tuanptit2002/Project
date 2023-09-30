package com.example.giasu.Service;

import com.example.giasu.DTO.RespondDTO;
import com.example.giasu.DTO.SubjectDTO;
import com.example.giasu.Entity.Subject;
import com.example.giasu.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService{

    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public void create(SubjectDTO subjectDTO) {
        Subject subject =new Subject();
        subject.setSubject(subjectDTO.getSubject());
        subjectRepository.save(subject);
    }

    @Override
    public RespondDTO<List<Subject>> findAll(){
        List<Subject> subjects = subjectRepository.findAll();
        RespondDTO<List<Subject>> respondDTO = new RespondDTO<>();
        respondDTO.setResult(subjects);
        return respondDTO;
    }
}
