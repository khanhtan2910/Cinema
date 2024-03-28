package com.assignment.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Entity.Movietype;

public interface MovieTypeDAO extends JpaRepository<Movietype, Integer>{
	
}
