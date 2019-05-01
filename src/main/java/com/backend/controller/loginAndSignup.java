package com.backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.Booking;
import com.backend.model.customerDetails;
import com.backend.service.customerDetailsService;

@RestController
public class loginAndSignup {
	
	private customerDetailsService customerDetailsService;
	
	@PostMapping("/customer/signup/Authentication")
	
	public ResponseEntity<?> save(@RequestBody customerDetails customerDetails){
		String checkAuth =signupAuthentication(customerDetails);
		
		if(checkAuth.equals("signup sucess")) {
			int customer_id=(int) customerDetailsService.save(customerDetails);
			// customer_id put into the session
			
			return ResponseEntity.ok().body("customer Register with id :"+customer_id);
		}
		
		else {
			return ResponseEntity.ok().body(checkAuth);
		}
		
	}
	
	@PostMapping("/customer/login/Authentication")
	
	public ResponseEntity<?>  login(@RequestBody customerDetails customerDetails){
		String checkLogin=loginAuthentication(customerDetails);
		
		if(checkLogin.equals("login success")) {
			return ResponseEntity.ok().body("login success ");
		}
		else {
			return ResponseEntity.ok().body("login fail ");
		}
	}
	
	// authentication fuction of the signup
	
	public String signupAuthentication(@RequestBody customerDetails customerDetails) {
		// get all the customers
			List<customerDetails> allCustomers=customerDetailsService.list();
			
		// check all the customers
			
			for(int i=0 ; i<allCustomers.size();i++) {
				// check whether username there exists 
				if(allCustomers.get(i).getUser_name().equalsIgnoreCase(customerDetails.getUser_name())) {
					return "username there exist" ;
				} 
				
				// check whether password there exists
				if(allCustomers.get(i).getEmail().equalsIgnoreCase(customerDetails.getEmail())) {
					return "email there exist" ;
				}
				
			}
			return "signup sucess" ;		
		}
	
	// authentication function of login
	
	public String loginAuthentication(@RequestBody customerDetails customerDetails) {
		// get all the customers
		List<customerDetails> allCustomers=customerDetailsService.list();
					
		// check all the customers
					
		for(int i=0 ; i<allCustomers.size();i++) {
			// check whether username there exists 
			if((allCustomers.get(i).getUser_name().equalsIgnoreCase(customerDetails.getUser_name())) && (allCustomers.get(i).getPassword().equalsIgnoreCase(customerDetails.getPassword()))) {
				long customer_id= allCustomers.get(i).getCustomer_id();
				//customer_id putting to the session
				
				return "login success" ;
			} 
						
		}			
		return "login fail" ;
	}

}
