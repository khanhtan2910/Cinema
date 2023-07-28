package com.assignment.Service;

import java.util.List;

import com.assignment.Entity.Booking;

public interface BookingService {

	List<Booking> findAll();

	Booking findById(Integer bookingId);

	void save(Booking booking);

	boolean existsById(Integer bookingId);

	void deleteById(Integer bookingId);

}
