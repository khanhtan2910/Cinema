package com.assignment.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Entity.Users;

public interface UsersDAO extends JpaRepository<Users,Integer>{

}
