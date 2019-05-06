package com.backend.service;

import java.util.List;

import com.backend.model.SocialEventBookingTimeSlots;

public interface SocialEventBookingTimeSlotsService {

	
	//save the record
			long save(SocialEventBookingTimeSlots socialEventBookingTimeSlots);
			
			//get a singel recorde
			SocialEventBookingTimeSlots get(long booking_id);
			
			// get all the recode
			List<SocialEventBookingTimeSlots> list();
			
			// update the recode
			void update(long booking_id,SocialEventBookingTimeSlots socialEventBookingTimeSlots);
			
			// delete the recode
			void delete(long booking_id);
}
