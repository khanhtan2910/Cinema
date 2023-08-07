package com.assignment.Service;

import java.util.List;

import com.assignment.Entity.Room;
import com.assignment.Entity.Show;

public interface ShowService {

	List<Show> findByRoom(Integer roomId);
	List<Show> findAll();
}
