package com.assignment.Rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.Entity.Cinema;
import com.assignment.Service.CinemaService;

import ch.qos.logback.core.model.Model;
@CrossOrigin("*")
@RestController
public class CinemaRestController {
	@Autowired
	CinemaService cinemaService;
	
	@GetMapping("/rest/cinemas")
	public List<Cinema> getAll(Model model){
		return cinemaService.findAll();
	}
	@GetMapping("/rest/cinemas/{cinemaId}")
	public ResponseEntity<Cinema> getOne(@PathVariable("cinemaId") Integer cinemaId) {
		if (!cinemaService.existsById(cinemaId)) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(cinemaService.findById(cinemaId));
	}
	@PostMapping("/rest/cinemas")
	public ResponseEntity<Cinema> post(@RequestBody Cinema cinema){
		if (cinemaService.existsById(cinema.getCinemaid())) {
			return ResponseEntity.badRequest().build();
		}
		cinemaService.save(cinema);
		return ResponseEntity.ok(cinema);
	}
	@PutMapping("/rest/cinemas/{cinemaId}")
	public ResponseEntity<Cinema> put(@RequestBody Cinema cinema,@PathVariable("cinemaId") Integer cinemaId){
		if (!cinemaService.existsById(cinema.getCinemaid())) {
			return ResponseEntity.notFound().build();
		}
		cinemaService.save(cinema);
		return ResponseEntity.ok(cinema);
	}
	@DeleteMapping("/rest/cinemas/{cinemaId}")
	public ResponseEntity<Void> delete(@PathVariable("cinemaId") Integer cinemaId){
		if (!cinemaService.existsById(cinemaId)) {
			return ResponseEntity.notFound().build();
		}
		cinemaService.deleteById(cinemaId);
		return ResponseEntity.ok().build();
	}
}
