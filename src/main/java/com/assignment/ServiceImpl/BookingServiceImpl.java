package com.assignment.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.BookingDAO;
import com.assignment.Service.BookingService;
@Service
public class BookingServiceImpl implements BookingService{
	@Autowired
	BookingDAO booKingDAO;
}
