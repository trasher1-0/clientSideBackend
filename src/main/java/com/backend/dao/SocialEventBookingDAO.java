package com.backend.dao;

import java.util.List;

import com.backend.model.SocialEventBooking;

public interface SocialEventBookingDAO {
	

	//save the record
	long save(SocialEventBooking socialEventBooking);
	
	//get a singel recorde
	 SocialEventBooking get(long booking_id);
	
	// get all the recode
	List<SocialEventBooking> list();
	
	// update the recode
	void update(long booking_id,SocialEventBooking socialEventBooking);
	
	// delete the recode
	void delete(long booking_id);

}
