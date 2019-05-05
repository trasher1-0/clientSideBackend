package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.backend.model.ServiceInvoice;
import com.mysql.cj.api.Session;

public class ServiceInvoiceImple implements ServiceInvoiceDAO {

	private SessionFactory sessionFactory;
	
	public long save(ServiceInvoice serviceInvoice) {
		sessionFactory.getCurrentSession().save(serviceInvoice);
		return serviceInvoice.getInvoice_id();
	}

	public ServiceInvoice get(long invoice_id) {
		ServiceInvoice serviceInvoice=sessionFactory.getCurrentSession().get(ServiceInvoice.class, invoice_id);
		return serviceInvoice;
	}

	public List<ServiceInvoice> list() {
		List<ServiceInvoice> allInvoices=sessionFactory.getCurrentSession().createQuery("from ServiceInvoice").list();
		return allInvoices;
	}

	public void update(long invoice_id, ServiceInvoice serviceInvoice) {
		Session session=(Session) sessionFactory.getCurrentSession();
		ServiceInvoice oldInvoice=((org.hibernate.Session) session).byId(ServiceInvoice.class).load(invoice_id);
		oldInvoice.setCustomer_name(serviceInvoice.getCustomer_name());
		oldInvoice.setAddress(serviceInvoice.getAddress());
		oldInvoice.setCity(serviceInvoice.getCity());
		((org.hibernate.Session) session).flush();
		
	}

	public void delete(long invoice_id) {
		Session session=(Session) sessionFactory.getCurrentSession();
		ServiceInvoice serviceInvoice=((org.hibernate.Session) session).byId(ServiceInvoice.class).load(invoice_id);
		((org.hibernate.Session) session).delete(serviceInvoice);
	}

}
