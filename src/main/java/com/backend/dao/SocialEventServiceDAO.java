package com.backend.dao;

import java.util.List;

import com.backend.model.SocialEventService;

public interface SocialEventServiceDAO {


	//save the record
	long save(SocialEventService socialEventService);
	
	//get a singel recorde
	 SocialEventService get(long invoice_id);
	
	// get all the recode
	List<SocialEventService> list();
	
	// update the recode
	void update(long invoice_id,SocialEventService socialEventService);
	
	// delete the recode
	void delete(long invoice_id);
}
