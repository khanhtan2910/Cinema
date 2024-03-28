package com.assignment.Service;

import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.assignment.Entity.Movie;



public interface MovieService {

	List<Movie> findAll();
	public Movie findById(Long movieid) ;

	List<Movie> findAllByName(String keyword);
	Page<Movie> findPaginated(Pageable pageable, List<Movie> movies);

	public Movie create(Movie movie) ;

	public Movie update(Movie Movie) ;

	public void delete(Long movieid) ;
		
}
