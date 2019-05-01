package com.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.Booking;
import com.backend.service.BookingService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class bookingController {
	// ./customer/booking
	// showBookings(date){}
	
	// ./customer/booking/submit
	// save(){}
	
	// ./customer/booking/edit/{bookingId}
	// updateBooking(){}
	
	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/booking")
	public ResponseEntity<?> save(@RequestBody Booking booking){
		long id = bookingService.save(booking);
		return ResponseEntity.ok().body("book created with id :"+id);
		
	}
}
