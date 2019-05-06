package com.backend.controller;

import java.util.List;

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
	private long customer_id;
	
	@RequestMapping("/customer/buyTrasher/submit")
	
	public ResponseEntity<?> save(@RequestBody trasherBuyingInvoice buyingInvoice){
		customer_id=loginAndSignupController.getCustomerId();
		buyingInvoiceService.save(customer_id,buyingInvoice);
		return ResponseEntity.ok().body("scessfully submited the invoice id "+buyingInvoice.getInvoice_id() );
		
	}
	
	@RequestMapping("/customer/buyTrasher/view/{invoice_id")
	public ResponseEntity<trasherBuyingInvoice> getBuyingInvoice(long invoice_id){
		trasherBuyingInvoice invoice=buyingInvoiceService.get(invoice_id);
		return ResponseEntity.ok().body(invoice);
		
	}
	
	@RequestMapping("/customer/buyingInvoice/update/{invoice_id}")
	public ResponseEntity<?> updateBuyingInvoiceInfo( @PathVariable long invoice_id,@RequestBody trasherBuyingInvoice buyingInvoice){
		buyingInvoiceService.update(invoice_id, buyingInvoice);
		return ResponseEntity.ok().body("successfully updated the invoice "+buyingInvoice.getInvoice_id());		
	}
	
	
	public List<trasherBuyingInvoice> getAllInvoices(long customer_id){
		List<trasherBuyingInvoice> AllInvoices=buyingInvoiceService.list();
		return AllInvoices;
	}
}
