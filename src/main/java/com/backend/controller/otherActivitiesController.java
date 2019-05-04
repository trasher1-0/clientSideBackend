package com.backend.controller;

import org.springframework.http.ResponseEntity;

import com.backend.model.Help;
import com.backend.service.HelpService;

public class otherActivitiesController {

	// show all the activities of purticular id
	// showActivities(id){}
	// show purticular activity
	// showActivityInfo(activityId){}
	
	private HelpService help;
	
	public ResponseEntity<Help> getOtherActivities(long customer_id){
		return null;
		
		
	}
	
}
