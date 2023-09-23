package com.example.giasu.Controller;

import com.example.giasu.DTO.SubjectDTO;
import com.example.giasu.DTO.SuccessDTO;
import com.example.giasu.Entity.Subject;
import com.example.giasu.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/subject")
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @PostMapping("/create")
    public SuccessDTO<String> create(@RequestBody SubjectDTO subjectDTO){
        subjectService.create(subjectDTO);
        return new SuccessDTO<>("Thành công");
    }
}
