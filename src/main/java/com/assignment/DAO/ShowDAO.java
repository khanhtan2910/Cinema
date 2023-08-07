package com.assignment.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.assignment.Entity.Room;
import com.assignment.Entity.Show;

public interface ShowDAO extends JpaRepository<Show, Integer>{
	
	@Query("SELECT o FROM Show o WHERE  o.room.roomid LIKE ?1")
	List<Show> findByRoom(Integer roomId);
	

}
