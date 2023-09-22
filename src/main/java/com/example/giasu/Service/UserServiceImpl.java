package com.example.giasu.Service;

import com.example.giasu.DTO.MajoredDTO;
import com.example.giasu.DTO.RespondDTO;
import com.example.giasu.DTO.UserDTO;
import com.example.giasu.Entity.*;
import com.example.giasu.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    DistrictRepository districtRepository;

    @Autowired
    CityRepository cityRepository;

    @Autowired
    MajoredRepository majoredRepository;

    @Autowired
    TeachClassRepository teachClassRepository;

    @Autowired
    TimeTeachRepository timeTeachRepository;

    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public String createTutor(UserDTO userDTO){
        RespondDTO<User> userRespondDTO = new RespondDTO<>();
        User user = new User();
        user.setCity(cityRepository.findByName(userDTO.getCityDTO()));
        user.setFullName(userDTO.getFullName());
        user.setBirthDay(userDTO.getBirthDay());
        user.setSex(userDTO.getSex());
        user.setAddress(userDTO.getAddress());
        user.setVoice(userDTO.getVoice());
        user.setCMND(userDTO.getCmnd());
        user.setEmail(userDTO.getEmail());
        user.setPhone(userDTO.getPhone());
        user.setPassword(userDTO.getPassword());
        user.setUniversity(userDTO.getUniversity());
        user.setMajored(majoredRepository.findByName(userDTO.getMajoredDTO()));
        user.setYearOfAdmission(userDTO.getYearOfAdmission());
        user.setGraduationYear(userDTO.getGraduationYear());
        user.setEducation(userDTO.getEducation());
        user.setMature(userDTO.getMature());
        List<Subject> subjects = new ArrayList<>();
        for(String subject : userDTO.getSubjectDTOS()){
            subjects.add(subjectRepository.findByName(subject));
        }
        user.setSubjects(subjects);
        List<TeachClass> teachClasses = new ArrayList<>();
        for (String teach : userDTO.getTeachClassDTOS()){
            TeachClass teachClass = teachClassRepository.findByName(teach);
            teachClasses.add(teachClass);
        }
        user.setTeachClasses(teachClasses);
        List<District> districts =new ArrayList<>();
        for(String district : userDTO.getDistrictDTOS()){
            districts.add(districtRepository.findByName(district));
        }
        user.setDistricts(districts);
        List<TimeTeach> timeTeaches = new ArrayList<>();
        for (String time : userDTO.getTimeTeachDTO()){
            timeTeaches.add(timeTeachRepository.findByName(time));
        }
        user.setTimeTeaches(timeTeaches);
        userRepository.save(user);
//        userRespondDTO.setResult(user);
        return "Thành Công";
    }

    @Override
    public String createFindTutor(UserDTO userDTO){
        User user = new User();
        user.setFullName(userDTO.getFullName());
        user.setAddress(userDTO.getAddress());
        user.setPhone(userDTO.getPhone());
//        if(!userDTO.getTutor().isEmpty()){
//
//        }
        user.setRequest(userDTO.getRequest());
        userRepository.save(user);
        return "Thành công";
    }
}
