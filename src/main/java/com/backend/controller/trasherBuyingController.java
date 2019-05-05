package com.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.model.trasherBuyingInvoice;
import com.backend.service.trasherBuyingInvoiceService;

public class trasherBuyingController {
	
	// ./customer/buyTrasher/submit
	// save(){} 
	// ./customer/buyTrasher/edit/{invoiceid}
	// edit() {}
	
	private trasherBuyingInvoice buyingInvoice;
	private trasherBuyingInvoiceService buyingInvoiceService;
	private loginAndSignup loginAndSignupController;
	
	@RequestMapping("/customer/buyTrasher/submit")
	
	public ResponseEntity<?> save(long customer_id,@RequestBody trasherBuyingInvoice buyingInvoice){
		customer_id=loginAndSignupController.getCustomerId();
		buyingInvoiceService.save(customer_id,buyingInvoice);
		return ResponseEntity.ok().body("scessfully submited the invoice id "+buyingInvoice.getInvoice_id() );
		
	}
	
	public ResponseEntity<trasherBuyingInvoice> getBuyingInvoices(long customer_id){
		return null;
		
	}
	
	@RequestMapping("/customer/buyingInvoice/update/{invoice_id}")
	public ResponseEntity<?> updateBuyingInvoiceInfo(@PathVariable long invoice_id,@RequestBody trasherBuyingInvoice buyingInvoice){
		return null;
		
	}
}
