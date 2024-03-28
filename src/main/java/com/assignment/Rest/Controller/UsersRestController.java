package com.assignment.Rest.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.Entity.Users;
import com.assignment.Service.UsersService;


@CrossOrigin("*")
@RestController
@RequestMapping("/rest/accounts")
public class UsersRestController {
	@Autowired
	UsersService usersService;
	
	@GetMapping
	public List<Users> getAccounts(@RequestParam("admin") Optional<Boolean> admin) {
		if(admin.orElse(false)) {
			return usersService.getAdministrators();
		}
		return usersService.findAll();
	}
	
	@GetMapping("{username}")
	public Users getOne(@PathVariable("userid") Integer userid) {
		return usersService.findById(userid);
	}
}
