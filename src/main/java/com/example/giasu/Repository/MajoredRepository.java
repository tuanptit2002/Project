package com.example.giasu.Repository;

import com.example.giasu.Entity.City;
import com.example.giasu.Entity.Majored;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

public interface MajoredRepository extends JpaRepository<Majored, Long> {
    @Query("select mj from Majored as mj where mj.name = :name")
    Majored findByName(@RequestParam("name") String name);
}
