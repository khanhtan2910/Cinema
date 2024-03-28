package com.assignment.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.ImageDAO;
import com.assignment.Entity.Image;
import com.assignment.Service.ImageService;

@Service
public class ImageServiceImpl implements ImageService  {
	@Autowired
	ImageDAO imageDAO;

	@Override
	public List<Image> findAll() {
		// TODO Auto-generated method stub
		return imageDAO.findAll();
	}

	@Override
	public boolean existsById(Integer imageId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Image findById(Integer imageId) {
		// TODO Auto-generated method stub
		return imageDAO.findById(imageId).get();
	}
	
	@Override
	public List<Image> findByName(String name) {
		// TODO Auto-generated method stub
		return imageDAO.findByName(name);
	}

	@Override
	public void save(Image image) {
		// TODO Auto-generated method stub
		imageDAO.save(image);
	}

	@Override
	public void deleteById(Integer imageId) {
		// TODO Auto-generated method stub
		imageDAO.deleteById(imageId);
	}
}
