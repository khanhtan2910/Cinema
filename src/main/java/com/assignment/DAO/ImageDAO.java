package com.assignment.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.assignment.Entity.Cinema;
import com.assignment.Entity.Image;

public interface ImageDAO extends JpaRepository<Image, Integer>{

	@Query("SELECT o FROM Image o WHERE  o.name LIKE CONCAT('%',?1,'%')")
	List<Image> findByName( String name);


}
