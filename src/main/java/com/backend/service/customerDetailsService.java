package com.backend.service;

import java.util.List;

import com.backend.model.customerDetails;

public interface customerDetailsService {

	//save the record
	long save(customerDetails customerDetails);
	
	//get a singel recorde
	customerDetails get(long customet_id);
	
	// get all the recode
	List<customerDetails> list();
	
	// update the recode
	void update(long customer_id,customerDetails customerDetails);
	
	// delete the recode
	void delete(long customer_id);
}
