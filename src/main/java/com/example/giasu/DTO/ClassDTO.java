package com.example.giasu.DTO;

import lombok.Data;

@Data
public class ClassDTO {

    private Long id ;
    private long subject;
    private Long classRoom;
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

    private Long city;
}
