package com.example.giasu.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDTO {
    private String subject;

    private List<UserDTO> userDTOS = new ArrayList<>();
}
