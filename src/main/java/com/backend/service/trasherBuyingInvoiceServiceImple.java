package com.backend.service;

import java.util.List;

import com.backend.dao.trasherBuyingInvoiceDAO;
import com.backend.model.trasherBuyingInvoice;

public class trasherBuyingInvoiceServiceImple implements trasherBuyingInvoiceService {

	private trasherBuyingInvoiceDAO trasherBuyingInvoiceDAO;
	
	public long save(long customer_id,trasherBuyingInvoice trasherBuyingInvoice) {
		// TODO Auto-generated method stub
		return 0;
	}

	public trasherBuyingInvoice get(long invoice_id) {
		return trasherBuyingInvoiceDAO.get(invoice_id);
		
	}

	public List<trasherBuyingInvoice> list() {
		return trasherBuyingInvoiceDAO.list();
	}

	public void update(long invoice_id, trasherBuyingInvoice trasherBuyingInvoice) {
		trasherBuyingInvoiceDAO.update(invoice_id, trasherBuyingInvoice);
		
	}

	public void delete(long invoice_id) {
		// TODO Auto-generated method stub
		
	}

}
