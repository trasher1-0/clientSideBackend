package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Booking;
import com.backend.service.BookingService;

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
		// TODO Auto-generated method stub
		return null;
	}

	public Booking get(long booking_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(long booking_id, Booking booking) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long booking_id) {
		// TODO Auto-generated method stub
		
	}


}
