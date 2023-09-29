package com.example.giasu.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


//    // lớp
//    private String classRoom;
    // địa ch sinh viên
    private String districts;
    // giá trên 1 buổi
    private String price;
    // số buổi trên 1 tuần
    private String numberSessions;
    // thời gian của học sinh rảnh
    private String timeTeach;
    // thông tin học vieen
    private String information;
    //yêu cầu
    private String request;
    // mô tả hình thức dạy
    private String describes;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;
    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "levelschool_id")
    private LevelSchool levelSchool;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "class-teachClass", joinColumns = @JoinColumn(name = "class_id"), inverseJoinColumns = @JoinColumn(name = "teachClass_id"))
    List<TeachClass> teachClasses = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
}
