package com.assignment.Rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.assignment.Entity.Room;
import com.assignment.Service.RoomService;

@RestController
public class RoomRestController {
	@Autowired
	RoomService roomService;
	
}
