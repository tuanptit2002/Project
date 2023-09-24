package com.example.giasu.Controller;

import com.example.giasu.DTO.ClassDTO;
import com.example.giasu.DTO.FilterClassDTO;
import com.example.giasu.DTO.SuccessDTO;
import com.example.giasu.Entity.Class;
import com.example.giasu.Service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/class")
public class ClassController {

    @Autowired
    ClassService classService;
    @PostMapping("/create")
    public SuccessDTO<String> create(@RequestBody ClassDTO classDTO){
        classService.create(classDTO);
        return new SuccessDTO<>("Thành công");
    }

    @PostMapping("/filter")
    public Page<Class> filter(@RequestBody FilterClassDTO filterClassDTO){
        return classService.filterClass(filterClassDTO);
    }

}
