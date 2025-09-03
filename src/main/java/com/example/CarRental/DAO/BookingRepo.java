package com.example.CarRental.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CarRental.Entity.booking;

@Repository
public interface BookingRepo extends JpaRepository<booking,Long> {
    
}
