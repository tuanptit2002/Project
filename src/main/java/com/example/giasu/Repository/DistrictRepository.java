package com.example.giasu.Repository;

import com.example.giasu.Entity.City;
import com.example.giasu.Entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

public interface DistrictRepository extends JpaRepository<District, Long> {

    @Query("select dt from District as dt where dt.name = :name")
    District findByName(@RequestParam("name") String name);
}
