package com.assignment.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.RoomDAO;
import com.assignment.Service.RoomService;

@Service
public class RoomServiceImpl implements RoomService{
	@Autowired
	RoomDAO roomDAO;
}
