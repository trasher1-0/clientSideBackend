package com.backend.dao;

import java.util.List;

import com.backend.model.trasherComments;

public interface trasherCommentsDAO {

	
	long saveSmallTrasherComment(trasherComments comment);
	
	long savePrimumTrasherComment(trasherComments comment);
	
	long saveLargeTrasherComments(trasherComments comment);
	
	//get a singel recorde
	 trasherComments get(long comment_id);
	
	// get all the recode
	List<trasherComments> list();
	
	// update the recode
	void update(long comment_id,trasherComments trasherComment);
	
	// delete the recode
	void delete(long comment_id);
}
