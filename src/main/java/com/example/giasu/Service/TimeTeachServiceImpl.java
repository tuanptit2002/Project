package com.example.giasu.Service;

import com.example.giasu.DTO.TimeTeachDTO;
import com.example.giasu.Entity.TimeTeach;
import com.example.giasu.Repository.TimeTeachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeTeachServiceImpl implements TimeTeachService{

    @Autowired
    TimeTeachRepository timeTeachRepository;

    @Override
    public String create(TimeTeachDTO timeTeachDTO){
        TimeTeach timeTeach = new TimeTeach();
        timeTeach.setName(timeTeachDTO.getName());
        timeTeachRepository.save(timeTeach);
        return "thành công";
    }
}
