package com.backend.dao;

import java.util.List;

import com.backend.model.Booking;
import com.backend.service.BookingService;

public interface BookingDAO {

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
