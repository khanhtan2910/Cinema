package com.assignment.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.CinemaDAO;
import com.assignment.DAO.RoomDAO;

import com.assignment.Entity.Room;
import com.assignment.Service.RoomService;

@Service
public class RoomServiceImpl implements RoomService{
	@Autowired
	RoomDAO roomDAO;
}
