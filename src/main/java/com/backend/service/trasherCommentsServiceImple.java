package com.backend.service;

import java.util.List;

import com.backend.dao.trasherCommentsDAO;
import com.backend.model.trasherComments;

public class trasherCommentsServiceImple implements trasherCommentsService{

	private trasherCommentsDAO trasherCommentDAO;
	
	
	public long saveSmallTrasherComment(trasherComments comment) {
		return trasherCommentDAO.saveSmallTrasherComment(comment);
	}
	
	public long savePrimumTrasherComment(trasherComments comment) {
		return trasherCommentDAO.savePrimumTrasherComment(comment);
	}

	public long saveLargeTrasherComments(trasherComments comment) {
		return trasherCommentDAO.saveLargeTrasherComments(comment);
	}
	
	public trasherComments get(long comment_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<trasherComments> list() {
		
		return trasherCommentDAO.list();
	}

	public void update(long commment_id, trasherComments trasherComment) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long comment_id) {
		// TODO Auto-generated method stub
		
	}

}
