package com.assignment.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.RoleDAO;
import com.assignment.Entity.Role;
import com.assignment.Service.RoleService;


@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	RoleDAO dao;
	
	public List<Role> findAll() {
		return dao.findAll();
	}
}
