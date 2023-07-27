package com.assignment.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Entity.MovieType;

public interface MovieTypeDAO extends JpaRepository<MovieType, Integer>{
	
}
