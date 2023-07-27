package com.assignment.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Entity.Booking;

public interface BookingDAO extends JpaRepository<Booking, Integer>{

}
