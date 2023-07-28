package com.assignment.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.RolePermissonDAO;
import com.assignment.Service.RolepermissionService;

@Service
public class RoleServiceImpl implements RolepermissionService{
	@Autowired
	RolePermissonDAO rolePermissonDAO;
}
