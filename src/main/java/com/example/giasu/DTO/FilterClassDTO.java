package com.example.giasu.DTO;

import lombok.Data;

@Data
public class FilterClassDTO {
    private int pageNum;
    private int pageSize;
    private Long id;
    private String describes;
    private Long id_city;
    private Long id_district;
    private String requestLevel;
    private String requestSex;
    private Long id_levelSchool;
    private Long subject;
    private Long classRoom;
//    private String levelRequest;
//    private String sex;
}
