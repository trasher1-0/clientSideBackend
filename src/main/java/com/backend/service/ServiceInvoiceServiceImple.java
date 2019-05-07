package com.backend.service;

import java.util.List;

import com.backend.dao.ServiceInvoiceDAO;
import com.backend.model.ServiceInvoice;

public class ServiceInvoiceServiceImple implements ServiceInvoiceService {

	private ServiceInvoiceDAO serviceInvoiceDAO;
	
	public long save(ServiceInvoice serviceInvoice) {
		return serviceInvoiceDAO.save(serviceInvoice);
	}

	public ServiceInvoice get(long invoice_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ServiceInvoice> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(long invoice_id, ServiceInvoice serviceInvoice) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long invoice_id) {
		// TODO Auto-generated method stub
		
	}

}
