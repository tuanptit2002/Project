package com.example.giasu.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class TimeTeach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany
    @JoinTable(name = "timeteach-user",
            joinColumns = @JoinColumn(name = "timeteach_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    List<User> users = new ArrayList<>();
}
