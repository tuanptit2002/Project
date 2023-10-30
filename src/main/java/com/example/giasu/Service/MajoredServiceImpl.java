package com.example.giasu.Service;

import com.example.giasu.DTO.MajoredDTO;
import com.example.giasu.DTO.RespondDTO;
import com.example.giasu.DTO.SuccessDTO;
import com.example.giasu.Entity.Majored;
import com.example.giasu.Repository.MajoredRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajoredServiceImpl implements  MajoredService{

    @Autowired
    MajoredRepository majoredRepository;

    public void create(MajoredDTO majoredDTO){
        Majored majored = new Majored();
        majored.setName(majoredDTO.getName());
        majoredRepository.save(majored);
//        return new SuccessDTO<>("Thanh cong");
    }

    public RespondDTO<List<Majored>> finAll(){
        List<Majored> majoreds = majoredRepository.findAll();
        RespondDTO<List<Majored>> respondDTO = new RespondDTO<>();
        respondDTO.setResult(majoreds);
        return respondDTO;
    }
}
