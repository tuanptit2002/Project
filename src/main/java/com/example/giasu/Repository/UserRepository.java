package com.example.giasu.Repository;

import com.example.giasu.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
//    @Query("select u from User as u where u.email = :email")
//    User findByEmail(@RequestParam("email") String email);
    Optional<User> findByEmail(String email);
}
