package com.assignment.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Entity.Chair;

public interface ChairDAO extends JpaRepository<Chair,Integer>{

}
