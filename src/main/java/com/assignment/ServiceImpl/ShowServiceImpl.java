package com.assignment.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.ShowDAO;
import com.assignment.Entity.Room;
import com.assignment.Entity.Show;
import com.assignment.Service.ShowService;

@Service
public class ShowServiceImpl implements ShowService{
	@Autowired
	ShowDAO showDAO;

	@Override
	public List<Show> findByRoom(Integer roomId) {
		// TODO Auto-generated method stub
		return showDAO.findByRoom(roomId);
	}

	@Override
	public List<Show> findAll() {
		// TODO Auto-generated method stub
		return showDAO.findAll();
	}

	

	
}
