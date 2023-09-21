package com.example.giasu.DTO;

import lombok.Data;

@Data
public class ClassDTO {
    private String subject;
    private String classRoom;
    private String districts;
    private double price;
    private String request;
    // mô tả
    private String describes;

    private UserDTO userDTO;

    private DistrictDTO districtDTO;
}
