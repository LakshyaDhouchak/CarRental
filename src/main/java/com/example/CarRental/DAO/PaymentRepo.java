package com.example.CarRental.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CarRental.Entity.payment;
@Repository
public interface PaymentRepo extends JpaRepository<payment,Long> {
    
}
