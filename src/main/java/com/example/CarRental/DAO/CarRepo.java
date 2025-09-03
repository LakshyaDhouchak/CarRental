package com.example.CarRental.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CarRental.Entity.Car;

@Repository
public interface CarRepo extends JpaRepository<Car,Long> {
    
}
