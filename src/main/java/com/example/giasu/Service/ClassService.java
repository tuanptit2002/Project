package com.example.giasu.Service;

import com.example.giasu.DTO.ClassDTO;
import com.example.giasu.DTO.FilterClassDTO;
import com.example.giasu.Entity.Class;
import org.springframework.data.domain.Page;

public interface ClassService {

    public void create(ClassDTO classDTO);

    public Page<Class>  filterClass(FilterClassDTO filterClassDTO);

    public Page<Class>  filterClassPageUSer(FilterClassDTO filterClassDTO);
    public Long TotalClass();
}
