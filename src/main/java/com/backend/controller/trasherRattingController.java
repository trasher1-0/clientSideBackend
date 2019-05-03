package com.backend.controller;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.Booking;
import com.backend.model.rattings;
import com.backend.service.rattingsService;
import com.mysql.cj.api.Session;

@RestController
public class trasherRattingController {

	private rattingsService rattingService;
	double smallTrasherRatting=0;
	double primumTrasherRatting=0;
	double largerTrasherRatting=0;
	int isRatedToSmallTrasher=0;
	int isRatedToPrimumTrasher=0;
	int isRatedToLargerTrasher=0;
	
	private rattings ratting;
	private long customer_id;
	
	// save the smallTrasher rattings
	
	@RequestMapping("/dashboad/smallTrasherRattings")
	
	public ResponseEntity<?> saveSmallTrasherRattings(@RequestBody rattings ratting){
		rattingService.saveSmallTrasherRattings(ratting);
		return ResponseEntity.ok().body("ratted for small Trasher by customer id "+ customer_id);
		
	}
	
	// save the primumTrasher rattings 
	@RequestMapping("/dashboad/primumTrasherRattings")
	
	public ResponseEntity<?> savePrimumTrasherRattings(@RequestBody rattings ratting){
		rattingService.savePrimumTrasherRattings(ratting);
		return ResponseEntity.ok().body("ratted for primum Trasher by customer id "+ customer_id);
		
	}
	
	// save the largeTrasher rattings 
	@RequestMapping("/dashboad/largeTrasherRattings")
	
	public ResponseEntity<?> saveLargeTrasherRattings(@RequestBody rattings ratting){
		rattingService.saveLargeTrasherRattings(ratting);
		return ResponseEntity.ok().body("ratted for large Trasher by customer id "+ customer_id);
		
	}
	
		
	public void getRattings(long customer_id) {
		// getting all the ratting objects
		List<rattings> allRattings=rattingService.list();
		double getSmallTrasherRattings=0;
		double getPrimumTrasherRattings=0;
		double getLargerTrasherRattings=0;
		
		int k=0;int m=0;int n=0;
		
		for(int i=0;i<allRattings.size();i++) {
			if(allRattings.get(i).getTrasher_type()==1) {
				getSmallTrasherRattings=(getSmallTrasherRattings+allRattings.get(i).getRated_value());
				k=(k+1);
				
				// checking rated by particular customer
				if(allRattings.get(i).getCustomer_id()==customer_id) {
					isRatedToSmallTrasher=1;
				}
			}
			if(allRattings.get(i).getTrasher_type()==2) {
				getPrimumTrasherRattings=(getPrimumTrasherRattings+allRattings.get(i).getRated_value());
				m=(m+1);
				
				// checking rated by particular customer
				if(allRattings.get(i).getCustomer_id()==customer_id) {
					isRatedToPrimumTrasher=1;
				}
			}
			if(allRattings.get(i).getTrasher_type()==3) {
				getLargerTrasherRattings=(getLargerTrasherRattings+allRattings.get(i).getRated_value());
				n=(n+1);
				
				// checking rated by particular customer
				if(allRattings.get(i).getCustomer_id()==customer_id) {
					isRatedToLargerTrasher=1;
				}
			}
		}
		smallTrasherRatting=(getSmallTrasherRattings/k);
		primumTrasherRatting=(getPrimumTrasherRattings/m);
		largerTrasherRatting=(getLargerTrasherRattings/n);	
	}
	
	public double getSmallTrasherRattings() {
		return smallTrasherRatting;
	}
	
	public double getPrimumTrasherRattings() {
		return  primumTrasherRatting;
	}
	
	public double getLargeTrasherRattings() {
		return largerTrasherRatting;
	}
	
	public boolean isRatedForSmallTrasher() {
		if(isRatedToSmallTrasher==1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isRatedForPrimumTrasher() {
		if(isRatedToPrimumTrasher==1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isRatedForLargerTrasher() {
		if(isRatedToLargerTrasher==1) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
