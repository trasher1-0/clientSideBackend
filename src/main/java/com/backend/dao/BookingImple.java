package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Booking;
import com.backend.service.BookingService;
import com.mysql.cj.api.Session;

@Repository
public class BookingImple implements BookingDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public long save(Booking booking) {
		sessionFactory.getCurrentSession().save(booking);
		return Booking.getBooking_id();
	}

	public List<Booking> list() {
		List<Booking> allBookings=sessionFactory.getCurrentSession().createQuery("from Booking").list();
		return allBookings;
	}

	public Booking get(long booking_id) {
		Booking booking=sessionFactory.getCurrentSession().get(Booking.class,booking_id);
		return booking;
	}

	public void update(long booking_id, Booking booking) {
		Session session=(Session) sessionFactory.getCurrentSession();
		Booking allBooking =((org.hibernate.Session) session).byId(Booking.class).load(booking_id);
		allBooking.setCustomer_name(booking.getCustomer_name());
		allBooking.setCustomer_id(booking.getCustomer_id());
		allBooking.setAddress(booking.getAddress());
		allBooking.setCity(booking.getCity());
		((org.hibernate.Session) session).flush();
		
	}

	public void delete(long booking_id) {
		Session session=(Session) sessionFactory.getCurrentSession().get(Booking.class,booking_id);
		Booking booking=((org.hibernate.Session) session).byId(Booking.class).load(booking_id);
		((org.hibernate.Session) session).delete(booking);
	}


}
