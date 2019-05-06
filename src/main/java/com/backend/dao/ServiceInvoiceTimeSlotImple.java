package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.backend.model.ServiceInvoiceTimeSolts;

public class ServiceInvoiceTimeSlotImple implements ServiceInvoiceTimeSlotDAO{
	
	private SessionFactory sessionFactory;
	public List<ServiceInvoiceTimeSolts> allServiceInvoiceTimeSlots;

	@Override
	public long save(ServiceInvoiceTimeSolts serviceInvoiceTimeSlots) {
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
		allServiceInvoiceTimeSlots=sessionFactory.getCurrentSession().createQuery("from ServiceInvoiceTimeSolts").list();
		return allServiceInvoiceTimeSlots;
	}

	@Override
	public void update(long invoice_id, ServiceInvoiceTimeSolts serviceInvoiceTimeSlots) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long invoice_id) {
		// TODO Auto-generated method stub
		
	}

}
