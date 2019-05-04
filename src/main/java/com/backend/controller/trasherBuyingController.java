package com.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.model.trasherBuyingInvoice;

public class trasherBuyingController {
	
	// ./customer/buyTrasher/submit
	// save(){} 
	// ./customer/buyTrasher/edit/{invoiceid}
	// edit() {}
	
	public ResponseEntity<trasherBuyingInvoice> getBuyingInvoices(long customer_id){
		return null;
		
	}
	
	@RequestMapping("/customer/buyingInvoice/update/{invoice_id}")
	public ResponseEntity<?> updateBuyingInvoiceInfo(@PathVariable long invoice_id,@RequestBody trasherBuyingInvoice buyingInvoice){
		return null;
		
	}
}
