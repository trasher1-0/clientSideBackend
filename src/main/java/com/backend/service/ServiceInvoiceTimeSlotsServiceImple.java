package com.backend.service;

import java.util.List;

import com.backend.dao.ServiceInvoiceTimeSlotDAO;
import com.backend.model.ServiceInvoiceTimeSolts;

public class ServiceInvoiceTimeSlotsServiceImple implements ServiceInvoiceTimeSlotsService{

	private ServiceInvoiceTimeSlotDAO serviceInvoiceTimeSlotDAO;
	
	@Override
	public long save(ServiceInvoiceTimeSolts serviceInvoiceTimeSlot) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ServiceInvoiceTimeSolts get(long invoice_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ServiceInvoiceTimeSolts> list() {
		return serviceInvoiceTimeSlotDAO.list();
	}

	@Override
	public void update(long invoice_id, ServiceInvoiceTimeSolts serviceInvoiceTimeSlot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long invoice_id) {
		// TODO Auto-generated method stub
		
	}

}
