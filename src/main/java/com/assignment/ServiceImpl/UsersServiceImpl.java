package com.assignment.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.UsersDAO;
import com.assignment.Entity.Users;
import com.assignment.Service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{
	@Autowired
	UsersDAO dao;

	@Override
	public List<Users> findAll() {
		return dao.findAll();
	}

	@Override
	public Users findById(Integer userid) {
		return dao.findById(userid).get();
	}

	@Override
	public List<Users> getAdministrators() {
		return dao.getAdministrators();
	}
}
