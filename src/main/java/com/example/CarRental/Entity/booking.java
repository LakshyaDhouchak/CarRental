package com.example.CarRental.Entity;

import java.time.LocalDate;

import com.example.CarRental.Enum.BookingStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Booking")
@Data
public class booking {
    // define the properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "User_Id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "Car_id", nullable = false)
    private Car car;

    private LocalDate startDate;
    private LocalDate endDate;
    private Double totalAmount;

    @Enumerated(EnumType.STRING)
    private BookingStatus status;

}
