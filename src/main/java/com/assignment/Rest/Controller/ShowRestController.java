package com.assignment.Rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.Entity.Cinema;
import com.assignment.Entity.Room;
import com.assignment.Entity.Show;
import com.assignment.Service.ShowService;

@RestController
public class ShowRestController {
	@Autowired
	ShowService showService;
	
	@GetMapping("/rest/shows/withRoom/{roomId}")
	public ResponseEntity<List<Show>> getShowWithRoom(@PathVariable("roomId") Integer roomId) {
		return ResponseEntity.ok(showService.findByRoom(roomId));
	}
	@GetMapping("/rest/shows")
	public ResponseEntity<List<Show>> getShows() {
		return ResponseEntity.ok(showService.findAll());
	}
}