package com.assignment.Service;

import java.util.List;

import com.assignment.Entity.Cinema;

public interface CinemaService {

	List<Cinema> findAll();

	boolean existsById(Integer cinemaId);

	Cinema findById(Integer cinemaId);

	void save(Cinema cinema);

	void deleteById(Integer cinemaId);

}
