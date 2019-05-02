package com.backend.controller;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.backend.controller.trasherRattingController;
import com.backend.model.trasherComments;
import com.backend.controller.*;
import com.backend.model.*;


import com.mysql.cj.api.Session;

// import trasherCommentsController
//import trasherRattingController

@RestController
public class dashboadController {

	// requested url 
	// ../customer/dashboad
	// method ->
	//renderDashboad(){
					// loadding small trasher ratting from getSmallTrasherRatting() method
					// loadding primum trasher ratting from getprimumTrasherRatting() method
					// loadding large trasher ratting from getLargeTrasherRatting() method
	
					// loadding small trasher comments from getSmallTrasherComments() method
					// loadding Primum trasher comments from getPrimumTrasherComments() method
					// loadding large trasher comments from getlargeTrasherRatting() method
	// }
	
	
	// getting the customer_id from the session
	
	private loginAndSignup loginAndSignupController;
	private trasherRattingController trasherRattingController;
	private trasherCommentsController trasherCommentController;
	public double smallTrasherRattings;
	public double primumTrasherRattings;
	public double largerTrasherRattings;
	public boolean isRatedForSmallTrasher;
	public boolean isRatedForPrimumTrasher;
	public boolean isRatedForLargerTrasher;
	private long customer_id=loginAndSignupController.getCustomerId();
	
	

	@GetMapping("customer/dashboad")
	public void renderDashboad() {
		
		
		trasherRattingController.getRattings(customer_id);
		smallTrasherRattings=trasherRattingController.getSmallTrasherRattings();
		primumTrasherRattings=trasherRattingController.getPrimumTrasherRattings();
		largerTrasherRattings=trasherRattingController.getLargeTrasherRattings();
		isRatedForSmallTrasher=trasherRattingController.isRatedForSmallTrasher();
		isRatedForPrimumTrasher=trasherRattingController.isRatedForPrimumTrasher();
		isRatedForLargerTrasher=trasherRattingController.isRatedForLargerTrasher();
		
		
		
	}


	
}
