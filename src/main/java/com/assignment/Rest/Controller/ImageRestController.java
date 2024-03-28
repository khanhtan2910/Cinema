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
import com.assignment.Entity.Image;
import com.assignment.Service.CinemaService;
import com.assignment.Service.ImageService;

import ch.qos.logback.core.model.Model;
@CrossOrigin("*")
@RestController
public class ImageRestController {
	@Autowired
	ImageService imageService;
	
	@GetMapping("/rest/images")
	public List<Image> getAll(Model model){
		return imageService.findAll();
	}
	@GetMapping("/rest/images/{imageId}")
	public ResponseEntity<Image> getOne(@PathVariable("imageId") Integer imageId) { 
		if (!imageService.existsById(imageId)) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(imageService.findById(imageId));
	}
	@GetMapping("/rest/images/name/{name}")
	public ResponseEntity<List<Image>> getOneWithName(@PathVariable("name") String name) { 
		
		return ResponseEntity.ok(imageService.findByName(name));
	}
	@PostMapping("/rest/images")
	public ResponseEntity<Image> post(@RequestBody Image image){
		if (imageService.existsById(image.getImageid())) {
			return ResponseEntity.badRequest().build();
		}
		imageService.save(image);
		return ResponseEntity.ok(image);
	}
	@PutMapping("/rest/images/{imageId}")
	public ResponseEntity<Image> put(@RequestBody Image image,@PathVariable("imageId") Integer imageId){
		if (!imageService.existsById(image.getImageid())) {
			return ResponseEntity.notFound().build();
		}
		imageService.save(image);
		return ResponseEntity.ok(image);
	}
	
	@DeleteMapping("/rest/images/{imageId}")
	public ResponseEntity<Void> delete(@PathVariable("imageId") Integer imageId){
		if (!imageService.existsById(imageId)) {
			return ResponseEntity.notFound().build();
		}
		imageService.deleteById(imageId);
		return ResponseEntity.ok().build();
	}
}
