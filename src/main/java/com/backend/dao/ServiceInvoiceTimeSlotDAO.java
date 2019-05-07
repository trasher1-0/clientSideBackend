package com.backend.dao;

import java.util.List;

import com.backend.model.ServiceInvoiceTimeSolts;

public interface ServiceInvoiceTimeSlotDAO {

	//save the record
		long save(long invoice_id,List<ServiceInvoiceTimeSolts> serviceInvoiceTimeSlots);
		
		//get a singel recorde
		ServiceInvoiceTimeSolts get(long invoice_id);
		
		// get all the recode
		List<ServiceInvoiceTimeSolts> list();
		
		// update the recode
		void update(long invoice_id,ServiceInvoiceTimeSolts serviceInvoiceTimeSlots);
		
		// delete the recode
		void delete(long invoice_id);
}
