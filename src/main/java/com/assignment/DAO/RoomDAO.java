package com.assignment.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.assignment.Entity.Cinema;
import com.assignment.Entity.Room;

public interface RoomDAO extends JpaRepository<Room, Integer>{
		

}
