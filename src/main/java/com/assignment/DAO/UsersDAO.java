package com.assignment.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.assignment.Entity.Users;


public interface UsersDAO extends JpaRepository<Users,Integer>{
	@Query("SELECT DISTINCT ar.name  FROM Role ar WHERE ar.roleid IN ('DIRE', 'STAF')")
	List<Users> getAdministrators();
}
