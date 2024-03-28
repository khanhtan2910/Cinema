package com.assignment.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.CategoryDAO;
import com.assignment.Entity.Category;
import com.assignment.Service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryDAO dao;

	public List<Category> findAll() {
		return dao.findAll();
	}

	public Category findById(Integer categoryid) {
		return dao.findById(categoryid).get();
	}

	public Category create(Category category) {
		return dao.save(category);
	}

	public Category update(Category category) {
		return dao.save(category);
	}

	public void delete(Integer categoryid) {
		dao.deleteById(categoryid);
	}
}
