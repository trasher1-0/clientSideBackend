package com.backend.dao;

import java.util.List;

import com.backend.model.BookingTimeSlots;

public interface BookingTimeSlotsDAO {

	//save the record
	long save(BookingTimeSlots bookingTimeSlots);
	
	//get a singel recorde
	BookingTimeSlots get(long booking_id);
	
	// get all the recode
	List<BookingTimeSlots> list();
	
	// update the recode
	void update(long booking_id,BookingTimeSlots bookingTimeSlots);
	
	// delete the recode
	void delete(long booking_id);
}
