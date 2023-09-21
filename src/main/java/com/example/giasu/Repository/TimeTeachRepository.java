package com.example.giasu.Repository;

import com.example.giasu.Entity.City;
import com.example.giasu.Entity.TimeTeach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

public interface TimeTeachRepository extends JpaRepository<TimeTeach, Long> {

    @Query("select time from TimeTeach as time where time.name = :name")
    TimeTeach findByName(@RequestParam("name") String name);
}
