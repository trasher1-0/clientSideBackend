package com.backend.service;

import java.util.List;

import com.backend.dao.ServiceInvoiceTimeSlotDAO;
import com.backend.model.ServiceInvoiceTimeSolts;

public class ServiceInvoiceTimeSlotsServiceImple implements ServiceInvoiceTimeSlotsService{

	private ServiceInvoiceTimeSlotDAO serviceInvoiceTimeSlotDAO;
	
	@Override
	public long save(long invoice_id,List<ServiceInvoiceTimeSolts> serviceInvoiceTimeSlots) {
		return serviceInvoiceTimeSlotDAO.save(invoice_id, serviceInvoiceTimeSlots);
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
	public void update(long invoice_id, List<ServiceInvoiceTimeSolts> serviceInvoiceTimeSlot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long invoice_id) {
		// TODO Auto-generated method stub
		
	}

	

}
