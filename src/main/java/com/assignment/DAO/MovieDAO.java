package com.assignment.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Entity.Movie;

public interface MovieDAO  extends JpaRepository<Movie, Integer>{
	
}
