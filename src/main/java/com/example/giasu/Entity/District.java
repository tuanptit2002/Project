package com.example.giasu.Entity;

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
    @ManyToMany(mappedBy = "districts")
    List<User> users = new ArrayList<>();
    @OneToMany(mappedBy = "district")
    List<Class> classes = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City  city;
}
