package com.assignment.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.UsersDAO;
import com.assignment.Service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{
	@Autowired
	UsersDAO usersDAO;
}
