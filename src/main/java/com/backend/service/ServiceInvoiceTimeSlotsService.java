package com.backend.service;

import java.util.List;

import com.backend.model.ServiceInvoice;
import com.backend.model.ServiceInvoiceTimeSolts;

public interface ServiceInvoiceTimeSlotsService {

	//save the record
		long save(ServiceInvoiceTimeSolts serviceInvoiceTimeSlot);
		
		//get a singel recorde
		ServiceInvoiceTimeSolts get(long invoice_id);
		
		// get all the recode
		List<ServiceInvoiceTimeSolts> list();
		
		// update the recode
		void update(long invoice_id,ServiceInvoiceTimeSolts serviceInvoiceTimeSlot);
		
		// delete the recode
		void delete(long invoice_id);
}
