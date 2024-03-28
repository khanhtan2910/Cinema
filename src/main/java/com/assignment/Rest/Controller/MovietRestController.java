package com.assignment.Rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.Entity.Movie;
import com.assignment.Service.MovieService;




@RestController
@RequestMapping("/rest/movies")
public class MovietRestController {
	@Autowired
	MovieService movieService;
	
	@GetMapping("")
	public List<Movie> getAll() {
		return movieService.findAll();
	}
	@GetMapping("{id}")
	public Movie getOne(@PathVariable("id") Long movieid) {
		return movieService.findById(movieid);
	}
	@PostMapping
	public Movie post(@RequestBody Movie movie) {
		movieService.create(movie);
		return movie;
	}
	@PutMapping("{id}")
	public Movie put(@PathVariable("id") Long movieid, @RequestBody Movie movie) {
		return movieService.update(movie);
	}
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Long movieid) {
		movieService.delete(movieid);
	}
}
