package com.backend.dao;

import java.util.List;

import com.backend.model.customerDetails;

public interface customerDetailsDAO {


	//save the record
	long save(customerDetails customerDetails);
	
	//get a singel recorde
	customerDetails get(long customer_id);
	
	// get all the recode
	List<customerDetails> list();
	
	// update the recode
	void update(long customer_id,customerDetails customerInfo);
	
	// delete the recode
	void delete(long customer_id);
}
