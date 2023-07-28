package com.assignment.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.ShowDAO;
import com.assignment.Service.ShowService;

@Service
public class ShowServiceImpl implements ShowService{
	@Autowired
	ShowDAO showDAO;
}
