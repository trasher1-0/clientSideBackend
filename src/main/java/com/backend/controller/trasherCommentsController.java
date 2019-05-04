package com.backend.controller;

import java.util.List;
import java.awt.*;
import java.util.function.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.trasherComments;
import com.backend.service.rattingsService;
import com.backend.service.trasherCommentsService;

@RestController
public class trasherCommentsController {
	
	private trasherCommentsService trasherComment;
	private List<trasherComments> smallTrasherComment;
	private List<trasherComments> primumTrasherComment;
	private List<trasherComments> largerTrasherComment;
	
	private trasherComments comment;
	private long customer_id;
	
	@RequestMapping("/dashboad/smallTrasherComment")
	
	public ResponseEntity<?> saveSmallTrasherComments(@RequestBody trasherComments comment) {
		trasherComment.saveSmallTrasherComment(comment);
		return ResponseEntity.ok().body("commented for small trasher by customer_id"+customer_id);
		
	}
	
	@RequestMapping("/dashboad/primumTrasherComment")
	
	public ResponseEntity<?> primumSmallTrasherComments(@RequestBody trasherComments comment) {
		trasherComment.savePrimumTrasherComment(comment);
		return ResponseEntity.ok().body("commented for primum trasher by customer_id"+customer_id);
		
	}
	
    @RequestMapping("/dashboad/largeTrasherComment")
	
	public ResponseEntity<?> saveLargeTrasherComments(@RequestBody trasherComments comment) {
		trasherComment.saveLargeTrasherComments(comment);
		return ResponseEntity.ok().body("commented for large trasher by customer_id"+customer_id);
		
	}
	
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
