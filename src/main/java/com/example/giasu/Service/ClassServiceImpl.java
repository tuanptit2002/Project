package com.example.giasu.Service;

import com.example.giasu.DTO.ClassDTO;
import com.example.giasu.DTO.FilterClassDTO;
import com.example.giasu.Entity.Class;
import com.example.giasu.Entity.TeachClass;
import com.example.giasu.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    ClassRepository classRepository;

    @Autowired
    LevelSchoolRepository levelSchoolRepository;

    @Autowired
    CityRepository cityRepository;

    @Autowired
    TeachClassRepository teachClassRepository;

    @Autowired
    DistrictRepository districtRepository;

    @Autowired
    SubjectRepository subjectRepository;
    @Override
    public void create(ClassDTO classDTO) {
        Class aClass = new Class();
        aClass.setSubject(subjectRepository.findById(
                classDTO.getSubject()).orElseThrow(() -> new RuntimeException("subject is valid")));
        List<TeachClass> teachClasses = new ArrayList<>();
        teachClasses.add(teachClassRepository.findById(
                classDTO.getClassRoom()).orElseThrow(() -> new RuntimeException("classroom is validate")));
        aClass.setTeachClasses(teachClasses);
        aClass.setDistricts(classDTO.getDistricts());
        aClass.setPrice(classDTO.getPrice());
        aClass.setNumberSessions(classDTO.getNumberSessions());
        aClass.setTimeTeach(classDTO.getTimeTeach());
        aClass.setInformation(classDTO.getInformation());
        aClass.setRequest(classDTO.getRequest());
        aClass.setDescribes(classDTO.getDescribes());
        aClass.setLevelSchool(levelSchoolRepository.findById(classDTO.getLevelSchool()).
                orElseThrow(() -> new RuntimeException("level school is valid")));
        aClass.setDistrict(districtRepository.findById(classDTO.getDistrictDTO()).
                orElseThrow(() -> new RuntimeException("District is valid")));
        aClass.setCity(cityRepository.findById(classDTO.getCity()).orElseThrow(() ->new RuntimeException("city is valid")));
        classRepository.save(aClass);
    }

    @Override
    public Page<Class> filterClass(FilterClassDTO filterClassDTO){
        Pageable pageable = PageRequest.of(filterClassDTO.getPageNum(),filterClassDTO.getPageSize());
        Page<Class> aClass = classRepository.findClass(pageable,filterClassDTO.getId(),
                filterClassDTO.getDescribes(),filterClassDTO.getId_city(),filterClassDTO.getId_district(),
                filterClassDTO.getRequestLevel(),filterClassDTO.getRequestSex(),
                filterClassDTO.getId_levelSchool(), filterClassDTO.getSubject(), filterClassDTO.getClassRoom());
            return aClass;
    }
}
