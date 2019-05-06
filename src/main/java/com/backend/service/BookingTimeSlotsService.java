package com.backend.service;

import java.util.List;

import com.backend.model.Booking;
import com.backend.model.BookingTimeSlots;

public interface BookingTimeSlotsService {

	//save the record
		long save(BookingTimeSlots bookingTimeSlot);
		
		//get a singel recorde
		BookingTimeSlots get(long booking_id);
		
		// get all the recode
		List<BookingTimeSlots> list();
		
		// update the recode
		void update(long booking_id,BookingTimeSlots bookingTimeSlot);
		
		// delete the recode
		void delete(long booking_id);
}
