package com.assignment.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.ImageDAO;
import com.assignment.Service.ImageService;

@Service
public class ImageServiceImpl implements ImageService  {
	@Autowired
	ImageDAO imageDAO;
}
