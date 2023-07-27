package com.assignment.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Entity.Room;

public interface RoomDAO extends JpaRepository<Room, Integer>{

}
