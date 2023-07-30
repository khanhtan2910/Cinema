package com.assignment.DAO;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.assignment.Entity.Cinema;


public interface CinemaDAO extends JpaRepository<Cinema, Integer>{
	@Query("SELECT o FROM Cinema o WHERE o.name LIKE ?1 and o.address LIKE ?2")
	List<Cinema> findByAdressAndSearch(String keywords, String address);
	
	@Query("SELECT o FROM Cinema o WHERE  o.address LIKE CONCAT('%',?1,'%')")
	List<Cinema> findByAddress( String address);
}
