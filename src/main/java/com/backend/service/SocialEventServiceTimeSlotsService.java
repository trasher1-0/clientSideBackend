package com.backend.service;

import java.util.List;

import com.backend.model.SocialEventServiceTimeSlots;

public interface SocialEventServiceTimeSlotsService {
	
	//save the record
			long save(SocialEventServiceTimeSlots socialEventServiceTimeSlots);
			
			//get a singel recorde
			SocialEventServiceTimeSlots get(long invoice_id);
			
			// get all the recode
			List<SocialEventServiceTimeSlots> list();
			
			// update the recode
			void update(long invoce_id,SocialEventServiceTimeSlots socialEventServiceTimeSlots);
			
			// delete the recode
			void delete(long invoice_id);
}
