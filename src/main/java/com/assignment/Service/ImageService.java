package com.assignment.Service;

import java.util.List;

import com.assignment.Entity.Image;



public interface ImageService {

	List<Image> findAll();

	boolean existsById(Integer imageId);
	


	Image findById(Integer imageId);
	
	List<Image> findByName(String name);

	void save(Image image);

	void deleteById(Integer imageId);

}
