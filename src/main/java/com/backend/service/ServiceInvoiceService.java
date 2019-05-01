package com.backend.service;

import java.util.List;

import com.backend.model.ServiceInvoice;

public interface ServiceInvoiceService {

	//save the record
	long save(ServiceInvoice serviceInvoice);
	
	//get a singel recorde
	 ServiceInvoice get(long invoice_id);
	
	// get all the recode
	List<ServiceInvoice> list();
	
	// update the recode
	void update(long invoice_id,ServiceInvoice serviceInvoice);
	
	// delete the recode
	void delete(long invoice_id);
}
