package com.backend.service;

import java.util.List;

import com.backend.model.Booking;

public interface BookingService {


	//save the record
	long save(Booking booking);
	
	//get a singel recorde
	 Booking get(long booking_id);
	
	// get all the recode
	List<Booking> list();
	
	// update the recode
	void update(long booking_id,Booking booking);
	
	// delete the recode
	void delete(long booking_id);
}
