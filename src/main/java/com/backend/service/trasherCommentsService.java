package com.backend.service;

import java.util.List;

import com.backend.model.trasherComments;

public interface trasherCommentsService {

		
		long saveSmallTrasherComment(trasherComments comment);
		
		long savePrimumTrasherComment(trasherComments comment);
		
		long saveLargeTrasherComments(trasherComments comment);
		
		//get a singel recorde
		 trasherComments get(long comment_id);
		
		// get all the recode
		List<trasherComments> list();
		
		// update the recode
		void update(long commment_id,trasherComments trasherComment);
		
		// delete the recode
		void delete(long comment_id);
}
