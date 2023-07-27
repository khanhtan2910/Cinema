package com.assignment.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Entity.Cinema;

public interface CinemaDAO extends JpaRepository<Cinema, Integer>{
	
}
