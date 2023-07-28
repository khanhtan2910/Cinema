package com.assignment.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.PermissionDAO;
import com.assignment.Service.PermissonService;

@Service
public class PermissionServiceImpl implements PermissonService{
	@Autowired
	PermissionDAO permissionDAO;
}
