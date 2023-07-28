package com.assignment.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.MovieDAO;
import com.assignment.Service.MovieService;
@Service
public class MovieServiceImpl implements MovieService{
	@Autowired
	MovieDAO movieDAO;
}
