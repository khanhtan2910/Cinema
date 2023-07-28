package com.assignment.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.BookingDAO;
import com.assignment.Entity.Booking;
import com.assignment.Service.BookingService;
@Service
public class BookingServiceImpl implements BookingService{
	@Autowired
	BookingDAO booKingDAO;

	@Override
	public List<Booking> findAll() {
		// TODO Auto-generated method stub
		return booKingDAO.findAll();
	}

	@Override
	public Booking findById(Integer bookingId) {
		// TODO Auto-generated method stub
		return booKingDAO.findById(bookingId).get();
	}

	@Override
	public void save(Booking booking) {
		// TODO Auto-generated method stub
		booKingDAO.save(booking);
	}
	@Override
	 public boolean existsById(Integer bookingId) {
		// TODO Auto-generated method stub
		return booKingDAO.existsById(bookingId);
	}

	@Override
	public void deleteById(Integer bookingId) {
		// TODO Auto-generated method stub
		booKingDAO.deleteById(bookingId);
	}
}
