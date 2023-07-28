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
		CategoryDAO categoryDAO;

		@Override
		public List<Category> findAll() {
			// TODO Auto-generated method stub
			return categoryDAO.findAll();
		}
}
