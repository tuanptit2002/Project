package com.example.giasu.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   private String fullName;
   private String email;
   private String password;
   private String sex;
   private String address;
   private Date birthDay;
   private String CMND;
   private String phone;
   //giọng nói
   private String voice;
   // trình độ
   private String education;
   // thành tích
   private String mature;
   //
    private String university;
    // nam nhap hoc
    private String yearOfAdmission;
    // nam tot nghiep
    private String graduationYear;

    private String request;
    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "use_district", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "district_id"))
    List<District> districts = new ArrayList<>();

    @ManyToMany(mappedBy = "users")
    private List<Subject> subjects = new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    List<Class> classes = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "majored_id")
    private Majored majored;
    @JsonIgnore
    @ManyToMany(mappedBy = "users")
    List<TeachClass> teachClasses = new ArrayList<>();
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
    @ManyToMany(mappedBy = "users")
    private List<TimeTeach> timeTeaches = new ArrayList<>();
}
