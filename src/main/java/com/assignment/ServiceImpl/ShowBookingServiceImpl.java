package com.assignment.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.ShowBookingDAO;
import com.assignment.Service.ShowBookingService;

@Service
public class ShowBookingServiceImpl implements ShowBookingService{
	@Autowired
	ShowBookingDAO showBookingDAO;
}
