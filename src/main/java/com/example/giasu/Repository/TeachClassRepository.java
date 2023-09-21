package com.example.giasu.Repository;

import com.example.giasu.Entity.City;
import com.example.giasu.Entity.TeachClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

public interface TeachClassRepository extends JpaRepository<TeachClass, Long> {

    @Query("select tc from TeachClass as tc where tc.classroom = :name")
    TeachClass findByName(@RequestParam("name") String name);
}
