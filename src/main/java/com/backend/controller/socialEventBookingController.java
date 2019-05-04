package com.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.model.SocialEventBooking;

public class socialEventBookingController {

	

	public ResponseEntity<SocialEventBooking> getSocialEventBookingInvoices(long customer_id){
		return null;
		
	}
	
	@RequestMapping("/customer/socialEventBookingInvoice/update/{booking_id}")
	public ResponseEntity<?> updateSocialEventBookingInvoiceInfo(@PathVariable long booking_id,@RequestBody SocialEventBooking socialEventBookingInvoice){
		return null;
		
	}
}
