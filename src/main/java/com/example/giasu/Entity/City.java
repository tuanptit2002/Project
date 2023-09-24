package com.example.giasu.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    @OneToMany(mappedBy = "city")
    List<District> districts = new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "city")
    private List<Class> classes = new ArrayList<>();
}
