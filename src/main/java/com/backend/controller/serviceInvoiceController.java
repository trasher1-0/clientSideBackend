package com.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.model.ServiceInvoice;

public class serviceInvoiceController {

	
	public ResponseEntity<ServiceInvoice> getServiceInvoices(long customer_id){
		return null;
		
	}
	
	@RequestMapping("/customer/serviceInvoice/update/{invoice_id}")
	public ResponseEntity<?> updateServiceInvoiceInfo(@PathVariable long invoice_id,@RequestBody ServiceInvoice serviceInvoice){
		return null;
		
	}
	
	@RequestMapping("/customer/getService")
	public void getAllTheBookings() {
		
	}
}
