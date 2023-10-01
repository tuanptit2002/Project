package com.example.giasu.DTO;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ClassDTO {

    private Long id ;
    private List<Long> subject;
//    private Long classRoom;
    private String districts;
    private String price;
    // số buổi trên 1 tuần
    private String numberSessions;
    // thời gian của học sinh rảnh
    private String timeTeach;
    // thông tin học vieen
    private String information;

    private String request;
    // mô tả
    private String describes;

    private UserDTO userDTO;

    private Long districtDTO;

    private Long levelSchool;

    private List<Long> teachClass = new ArrayList<>();

    private Long city;
}
