package com.assignment.DAO;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.assignment.Entity.Movie;




public interface MovieDAO  extends JpaRepository<Movie, Long>{
	
	@Query("SELECT o FROM Movie o WHERE o.name LIKE ?1")
	List<Movie> findAllByNameLike(String keywords);
	
}
