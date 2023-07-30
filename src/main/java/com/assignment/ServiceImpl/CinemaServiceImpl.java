package com.assignment.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.CinemaDAO;
import com.assignment.Entity.Cinema;
import com.assignment.Service.CinemaService;

@Service
public class CinemaServiceImpl implements CinemaService{
	@Autowired
	CinemaDAO cinemaDAO;

	@Override
	public List<Cinema> findAll() {
		// TODO Auto-generated method stub
		return cinemaDAO.findAll();
	}

	@Override
	public boolean existsById(Integer cinemaId) {
		// TODO Auto-generated method stub
		return cinemaDAO.existsById(cinemaId);
	}

	@Override
	public Cinema findById(Integer cinemaId) {
		// TODO Auto-generated method stub
		return cinemaDAO.findById(cinemaId).get();
	}

	@Override
	public void save(Cinema cinema) {
		// TODO Auto-generated method stub
		cinemaDAO.save(cinema);
	}

	@Override
	public void deleteById(Integer cinemaId) {
		// TODO Auto-generated method stub
		cinemaDAO.deleteById(cinemaId);
	}

	@Override
	public List<Cinema> findByAdressAndSearch(String address, String keyword) {
		// TODO Auto-generated method stub
		return cinemaDAO.findByAdressAndSearch(keyword, address);
	}

	@Override
	public List<Cinema> findByAddress(String address) {
		// TODO Auto-generated method stub
		return cinemaDAO.findByAddress(address);
	}

	
}
