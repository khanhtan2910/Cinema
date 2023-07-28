package com.assignment.Rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.Entity.Booking;
import com.assignment.Service.BookingService;

import ch.qos.logback.core.model.Model;

@CrossOrigin("*")
@RestController
public class BookingRestController {
	@Autowired
	BookingService bookingService;

	@GetMapping("/rest/bookings")
	public List<Booking> getAll(Model model) {
		return bookingService.findAll();
	}

	@GetMapping("/rest/bookings/{bookingId}")
	public ResponseEntity<Booking> getOne(@PathVariable("bookingId") Integer bookingId) {
		if (!bookingService.existsById(bookingId)) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(bookingService.findById(bookingId));
	}

	@PostMapping("/rest/bookings")
	public ResponseEntity<Booking> post(@RequestBody Booking booking) {
		if (bookingService.existsById(booking.getBookid())) {
			return ResponseEntity.badRequest().build();
		}
		bookingService.save(booking);
		return ResponseEntity.ok(booking);
	}

	@PutMapping("/rest/bookings/{bookingId}")
	public ResponseEntity<Booking> put(@RequestBody Booking booking, @PathVariable("bookingId") Integer bookingId) {
		if (!bookingService.existsById(booking.getBookid())) {
			return ResponseEntity.notFound().build();
		}
		bookingService.save(booking);
		return ResponseEntity.ok(booking);
	}

	@DeleteMapping("/rest/bookings/{bookingId}")
	public ResponseEntity<Void> delete(@PathVariable("bookingId") Integer bookingId) {
		if (!bookingService.existsById(bookingId)) {
			return ResponseEntity.notFound().build();
		}
		bookingService.deleteById(bookingId);
		return ResponseEntity.ok().build();
	}
}
