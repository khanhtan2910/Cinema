package com.assignment.Service;

import java.util.List;

import com.assignment.Entity.Users;


public interface UsersService {
	public List<Users> findAll() ;
	public Users findById(Integer userid) ;
	public List<Users> getAdministrators() ;
}
