package com.backend.dao;

import java.util.List;

import com.backend.model.SocialEventBookingTimeSlots;

public interface SocialEventBookingTimeSlotsDAO {

	//save the record
		long save(SocialEventBookingTimeSlots socialEventBookingTimeSlot);
		
		//get a singel recorde
		SocialEventBookingTimeSlots get(long booking_id);
		
		// get all the recode
		List<SocialEventBookingTimeSlots> list();
		
		// update the recode
		void update(long booking_id,SocialEventBookingTimeSlots socialEventBookingTimeSlot);
		
		// delete the recode
		void delete(long booking_id);
}
