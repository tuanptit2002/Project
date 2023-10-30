package com.example.giasu.Service;

import com.example.giasu.DTO.MajoredDTO;
import com.example.giasu.DTO.RespondDTO;
import com.example.giasu.DTO.SuccessDTO;
import com.example.giasu.Entity.Majored;

import java.util.List;

public interface MajoredService {

    public void create(MajoredDTO majoredDTO);

    public RespondDTO<List<Majored>> finAll();
}
