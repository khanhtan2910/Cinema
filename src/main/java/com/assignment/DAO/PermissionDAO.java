package com.assignment.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Entity.Permission;

public interface PermissionDAO extends JpaRepository<Permission, Integer>{
}
