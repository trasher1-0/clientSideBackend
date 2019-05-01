package com.backend.dao;

import java.util.List;

import com.backend.model.Help;

public interface HelpDAO {

	//save the record
		long save(Help help);
		
		//get a singel recorde
		 Help get(long help_id);
		
		// get all the recode
		List<Help> list();
		
		// update the recode
		void update(long help_id,Help help);
		
		// delete the recode
		void delete(long help_id);
}
