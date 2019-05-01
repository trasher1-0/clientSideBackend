package com.backend.service;

import java.util.List;

import com.backend.model.rattings;

public interface rattingsService {

	//save the record
			long save(rattings ratting);
			
			//get a singel recorde
			 rattings get(long customer_id);
			
			// get all the recode
			List<rattings> list();
			
			// update the recode
			void update(long customer_id,rattings ratting);
			
			// delete the recode
			void delete(long customer_id);
}
