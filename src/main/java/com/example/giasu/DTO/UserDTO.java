package com.example.giasu.DTO;

import com.example.giasu.Entity.Majored;
import com.example.giasu.Entity.Subject;
import com.example.giasu.Entity.TeachClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String fullName;
    private String email;
    private String password;
    private String sex;
    private String address;
    private Date birthDay;
    private String cmnd;
    private String phone;
    //giọng nói
    private String voice;
    // trình độ
    private String education;
    // thành tích
    private String mature;
    //
    private String university;
    // nam nhap hoc
    private String yearOfAdmission;
    // nam tot nghiep
    private String graduationYear;

    private List<String> districtDTOS = new ArrayList<>();

    private List<ClassDTO> classDTOS = new ArrayList<>();

    private List<String> subjectDTOS = new ArrayList<>();

    private String majoredDTO;

    private List<String> teachClassDTOS = new ArrayList<>();

    private String cityDTO;

    private List<String> timeTeachDTO = new ArrayList<>();
}
