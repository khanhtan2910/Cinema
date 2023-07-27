package com.assignment.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Entity.Category;

public interface CategoryDAO extends JpaRepository<Category, Integer>{

}
