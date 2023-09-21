package com.example.giasu.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "city")
    List<User> users = new ArrayList<>();
    @OneToMany(mappedBy = "city")
    List<District> districts = new ArrayList<>();
}
