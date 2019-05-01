package com.backend.dao;

import java.util.List;

import com.backend.model.Feedbacks;

public interface FeedbacksDAO {

	

	//save the record
	long save(Feedbacks feedback);
	
	//get a singel recorde
	 Feedbacks get(long feedback_id);
	
	// get all the recode
	List<Feedbacks> list();
	
	// update the recode
	void update(long feedback_id,Feedbacks feedback);
	
	// delete the recode
	void delete(long feedback_id);
	
}
