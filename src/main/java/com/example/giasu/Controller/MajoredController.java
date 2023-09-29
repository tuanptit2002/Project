package com.example.giasu.Controller;

import com.example.giasu.DTO.MajoredDTO;
import com.example.giasu.DTO.SuccessDTO;
import com.example.giasu.Service.MajoredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v1/majored")
public class MajoredController {

    @Autowired
    MajoredService majoredService;
    @PostMapping("/create")
    public SuccessDTO<String> create(@RequestBody MajoredDTO majoredDTO){
        majoredService.create(majoredDTO);
        return new SuccessDTO<>("Thành công");
    }
}
