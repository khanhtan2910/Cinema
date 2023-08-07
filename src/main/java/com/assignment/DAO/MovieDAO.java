package com.assignment.DAO;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.assignment.Entity.Movie;



public interface MovieDAO  extends JpaRepository<Movie, Integer>{
	List<Movie> findAllByNameLike(String keywords);
	
	@Query("SELECT m FROM Movie m WHERE m.movieid in ( SELECT mt.movie.movieid FROM m.movieTypes mt where mt.category.categoryid = ?1)")
	List<Movie> findAllByCategory(Integer cid);
}
