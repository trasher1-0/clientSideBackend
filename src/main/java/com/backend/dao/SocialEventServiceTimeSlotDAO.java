package com.backend.dao;

import java.util.List;

import com.backend.model.SocialEventServiceTimeSlots;

public interface SocialEventServiceTimeSlotDAO {

	//save the record
		long save(SocialEventServiceTimeSlots socialEventServiceTimeSlot);
		
		//get a singel recorde
		SocialEventServiceTimeSlots get(long invoice_id);
		
		// get all the recode
		List<SocialEventServiceTimeSlots> list();
		
		// update the recode
		void update(long invoice_id,SocialEventServiceTimeSlots socialEventServiceTimeSlot);
		
		// delete the recode
		void delete(long invoice_id);
}
