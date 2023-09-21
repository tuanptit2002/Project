package com.example.giasu.Repository;

import com.example.giasu.Entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

public interface CityRepository extends JpaRepository<City, Long> {

    @Query("select city from City as city where city.name = :name")
    City findByName(@RequestParam("name") String name);

}
