package com.backend.service;

import java.util.List;

import com.backend.dao.trasherCommentsDAO;
import com.backend.model.trasherComments;

public class trasherCommentsServiceImple implements trasherCommentsService{

	private trasherCommentsDAO trasherComment;
	
	public long save(trasherComments trasherComment) {
		// TODO Auto-generated method stub
		return 0;
	}

	public trasherComments get(long comment_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<trasherComments> list() {
		
		return trasherComment.list();
	}

	public void update(long commment_id, trasherComments trasherComment) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long comment_id) {
		// TODO Auto-generated method stub
		
	}

}
