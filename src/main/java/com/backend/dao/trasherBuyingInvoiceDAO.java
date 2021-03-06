package com.backend.dao;

import java.util.List;

import com.backend.model.trasherBuyingInvoice;

public interface trasherBuyingInvoiceDAO {


	//save the record
	long save(long customer_id,trasherBuyingInvoice trasherBuyingInvoice);
	
	//get a singel recorde
	 trasherBuyingInvoice get(long invoice_id);
	
	// get all the recode
	List<trasherBuyingInvoice> list();
	
	// update the recode
	void update(long invoice_id,trasherBuyingInvoice trasherBuyingInvoice);
	
	// delete the recode
	void delete(long invoice_id);
}
