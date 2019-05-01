package com.backend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.backend.model.SocialEventService;

public class SocialEventServiceImple implements SocialEventServiceDAO{

	SessionFactory sessionFactory;
	
	public long save(SocialEventService socialEventService) {
		sessionFactory.getCurrentSession().save(socialEventService);
		return socialEventService.getInvoce_id();
	}

	public SocialEventService get(long invoice_id) {
		SocialEventService socialEventService=sessionFactory.getCurrentSession().get(SocialEventService.class,invoice_id);
		return socialEventService;
	}

	public List<SocialEventService> list() {
		List<SocialEventService> allSocialEventServices=sessionFactory.getCurrentSession().createQuery("from SocialEventService").list();
		return allSocialEventServices;
	}

	public void update(long invoice_id, SocialEventService socialEventService) {
		Session session = sessionFactory.getCurrentSession();
		SocialEventService oldSocialEventService=session.byId(SocialEventService.class).load(invoice_id);
		oldSocialEventService.setAddress(socialEventService.getAddress());
		oldSocialEventService.setCity(socialEventService.getCity());
		oldSocialEventService.setCustomer_id(socialEventService.getCustomer_id());
		oldSocialEventService.setCustomer_name(socialEventService.getCustomer_name());
		oldSocialEventService.setDate(socialEventService.getDate());
		oldSocialEventService.setTime_slot(socialEventService.getTime_slot());
		session.flush();
	}

	public void delete(long invoice_id) {
		Session session = sessionFactory.getCurrentSession();
		SocialEventService socialEventService=session.byId(SocialEventService.class).load(invoice_id);
		session.delete(socialEventService);
	}

}
