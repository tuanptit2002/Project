package com.example.giasu.Controller;

import com.example.giasu.DTO.SuccessDTO;
import com.example.giasu.DTO.TimeTeachDTO;
import com.example.giasu.Service.TimeTeachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v1/time-teach")
public class TimeTeachController {

    @Autowired
    TimeTeachService timeTeachService;

    @PostMapping("/create")
    public SuccessDTO<String> create(@RequestBody TimeTeachDTO timeTeachDTO){
        timeTeachService.create(timeTeachDTO);
        return new SuccessDTO<>("Thành công");
    }
}
