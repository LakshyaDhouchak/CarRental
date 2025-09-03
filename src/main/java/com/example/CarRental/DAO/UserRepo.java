package com.example.CarRental.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CarRental.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    // define the custom methord
    User findByEmail(String email);
}
