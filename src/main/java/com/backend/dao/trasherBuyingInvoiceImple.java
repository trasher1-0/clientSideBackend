package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.backend.model.trasherBuyingInvoice;
import com.mysql.cj.api.Session;

public class trasherBuyingInvoiceImple implements trasherBuyingInvoiceDAO{

	private SessionFactory sessionFactory;
	
	public long save(long customer_id,trasherBuyingInvoice trasherBuyingInvoice) {
		trasherBuyingInvoice.customer_id=customer_id;
		sessionFactory.getCurrentSession().save(trasherBuyingInvoice);
		return trasherBuyingInvoice.getInvoice_id();
	}

	public trasherBuyingInvoice get(long invoice_id) {
		trasherBuyingInvoice buyInvoice=sessionFactory.getCurrentSession().get(trasherBuyingInvoice.class,invoice_id);
		return buyInvoice;
	}

	public List<trasherBuyingInvoice> list() {
		List<trasherBuyingInvoice> allBuyingInvoices=sessionFactory.getCurrentSession().createQuery("from trasherBuyingInvoice").list();
		return allBuyingInvoices;
	}

	public void update(long invoice_id, trasherBuyingInvoice trasherBuyingInvoice) {
		Session session=(Session) sessionFactory.getCurrentSession();
		trasherBuyingInvoice oldBuyInvoice=((org.hibernate.Session) session).byId(trasherBuyingInvoice.class).load(invoice_id);
		oldBuyInvoice.setAddress(trasherBuyingInvoice.getAddress());
		oldBuyInvoice.setCity(trasherBuyingInvoice.getCity());
		oldBuyInvoice.setCustomer_name(trasherBuyingInvoice.getCustomer_name());
		oldBuyInvoice.setDate(trasherBuyingInvoice.getDate());
		oldBuyInvoice.setQuentity(trasherBuyingInvoice.getQuentity());
		((org.hibernate.Session) session).flush();
	}

	public void delete(long invoice_id) {
		Session session=(Session) sessionFactory.getCurrentSession();
		trasherBuyingInvoice buyingInvoice=((org.hibernate.Session) session).byId(trasherBuyingInvoice.class).load(invoice_id);
		((org.hibernate.Session) session).delete(buyingInvoice);
	}

}
