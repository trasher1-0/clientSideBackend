package com.backend.controller;



import java.util.List;
import java.awt.*;
import java.util.function.*;

import com.backend.model.trasherComments;
import com.backend.service.rattingsService;
import com.backend.service.trasherCommentsService;

public class trasherCommentsController {
	
	// requestMapping urls
	
	// ../customer/smallTrasher/comment
	
	// ../customer/primumTrasher/comment
	
	// ../customer/largeTrasher/comment
	
	// method for return all the comments for purticular trasher
	
	private trasherCommentsService trasherComment;
	private List<trasherComments> smallTrasherComment;
	private List<trasherComments> primumTrasherComment;
	private List<trasherComments> largerTrasherComment;
	
	
	public void getComments() {
		
		// getting all the comments objects
		List<trasherComments> allComments=trasherComment.list();
		int k=0;int m=0 ; int n=0;
		
		for(int i=0;i<allComments.size();i++) {
			if(allComments.get(i).getTrasher_type()==1) {
				smallTrasherComment.add(allComments.get(i));
			}
			if(allComments.get(i).getTrasher_type()==2) {
				primumTrasherComment.add(allComments.get(i));
			}
			if(allComments.get(i).getTrasher_type()==3) {
				largerTrasherComment.add(allComments.get(i));
			}
		}
		
	}
	
	public List<trasherComments> getSmallTrasherComments() {
		
		return smallTrasherComment ;
	}
	
	public List<trasherComments> getPrimumTrasherComments() {
		
		return primumTrasherComment ;
	}
	
	public List<trasherComments> getLargeTrasherComments() {
		
		return largerTrasherComment ;
	}
	
}
