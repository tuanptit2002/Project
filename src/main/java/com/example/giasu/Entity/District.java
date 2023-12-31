package com.example.giasu.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @JsonIgnore
    @ManyToMany(mappedBy = "districts")
    List<User> users = new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "district")
    List<Class> classes = new ArrayList<>();
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City  city;
}
