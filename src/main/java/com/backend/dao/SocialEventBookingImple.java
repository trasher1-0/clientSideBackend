package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.backend.model.SocialEventBooking;
import com.mysql.cj.api.Session;

public class SocialEventBookingImple implements SocialEventBookingDAO {

	private SessionFactory sessionFactory;
	
	public long save(SocialEventBooking socialEventBooking) {
		sessionFactory.getCurrentSession().save(socialEventBooking);
		return socialEventBooking.getBooking_id();
	}

	public SocialEventBooking get(long booking_id) {
		SocialEventBooking socialEventBooking=sessionFactory.getCurrentSession().get(SocialEventBooking.class, booking_id);
		return socialEventBooking;
	}

	public List<SocialEventBooking> list() {
		List<SocialEventBooking> socialEventBookingList=sessionFactory.getCurrentSession().createQuery("from SocialEventBooking").list();
		return socialEventBookingList;
	}

	public void update(long booking_id, SocialEventBooking socialEventBooking) {
		Session session=(Session) sessionFactory.getCurrentSession();
		SocialEventBooking oldSocialEventBooking=((org.hibernate.Session) session).byId(SocialEventBooking.class).load(booking_id);
		oldSocialEventBooking.setAddress(socialEventBooking.getAddress());
		oldSocialEventBooking.setCity(socialEventBooking.getCity());
		oldSocialEventBooking.setCustomer_name(socialEventBooking.getCustomer_name());
		oldSocialEventBooking.setCustomer_id(socialEventBooking.getCustomer_id());
		oldSocialEventBooking.setDate(socialEventBooking.getDate());
		oldSocialEventBooking.setTime_slot(socialEventBooking.getTime_slot());
		((org.hibernate.Session) session).flush();
		
	}

	public void delete(long booking_id) {
		Session session=(Session) sessionFactory.getCurrentSession();
		SocialEventBooking socialEventBooking=((org.hibernate.Session) session).byId(SocialEventBooking.class).load(booking_id);
		((org.hibernate.Session) session).delete(socialEventBooking);
	}

}
