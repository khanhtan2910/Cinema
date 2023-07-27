package com.assignment.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Entity.Image;

public interface ImageDAO extends JpaRepository<Image, Integer>{

}
