package com.assignment.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.CinemaDAO;
import com.assignment.Service.CinemaService;

@Service
public class CinemaServiceImpl implements CinemaService{
	@Autowired
	CinemaDAO cinemaDAO;
}
