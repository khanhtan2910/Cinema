package com.assignment.Service;

import java.util.List;

import com.assignment.Entity.Category;

public interface CategoryService {
	List<Category> findAll();

	public Category findById(Integer categoryid) ;

	public Category create(Category category) ;

	public Category update(Category category) ;

	public void delete(Integer categoryid) ;
}
