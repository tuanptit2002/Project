package com.example.giasu.Repository;

import com.example.giasu.Entity.Subject;
import com.example.giasu.Entity.TeachClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

    @Query("select sb from Subject as sb where sb.subject = :name")
    Subject findByName(@RequestParam("name") String name);


}
