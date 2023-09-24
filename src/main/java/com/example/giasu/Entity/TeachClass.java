package com.example.giasu.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class TeachClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String classroom;
    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "user_teachclass",joinColumns = @JoinColumn(name = "teachclass_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    List<User> users = new ArrayList<>();
    @JsonIgnore
    @ManyToMany(mappedBy = "teachClasses")
    private List<Class> classes = new ArrayList<>();
}
