package com.assignment.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.FilmMakingDAO;
import com.assignment.Service.FilmMakingService;

@Service
public class FilmMakingServiceImpl implements FilmMakingService{
	@Autowired
	FilmMakingDAO filmMakingDAO;
}
