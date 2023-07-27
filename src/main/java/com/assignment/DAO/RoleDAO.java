package com.assignment.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Entity.Role;

public interface RoleDAO extends JpaRepository<Role, Integer>{

}
