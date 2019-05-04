package com.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.model.SocialEventService;

public class socialEventController {
		// ./customer/socialEvent/submit
		// save(){}
	
		// ./customer/socialEvent/edit/{eventInvoiceId}
		// editInvoice(eventInvoiceId){}
	
		// ./customer/socilaEvent/bookingForm/submit
		// saveBooking(){}
		
		// ./customer/socilaEvent/bookingForm/edit/{bookingId}
		// editBooking(){}
	
	public ResponseEntity<SocialEventService> getSocialEventServiceInvoices(long customer_id){
		return null;
		
	}
	
	@RequestMapping("/customer/socialEventInvoice/update/{invoice_id}")
	public ResponseEntity<?> updateSocialEventInvoiceInfo(@PathVariable long invoice_id,@RequestBody SocialEventService socialEventInvoice){
		return null;
		
	}
}
