package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.backend.model.BookingTimeSlots;

public class BookingTimeSlotsImple implements BookingTimeSlotsDAO {

	private SessionFactory sessionFactory;
	public List<BookingTimeSlots> allBookingTimeSlots;
	
	@Override
	public long save(BookingTimeSlots bookingTimeSlots) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BookingTimeSlots get(long booking_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookingTimeSlots> list() {
		allBookingTimeSlots=sessionFactory.getCurrentSession().createQuery("from BookingTimeSlots").list();
		return allBookingTimeSlots;
	}

	@Override
	public void update(long booking_id, BookingTimeSlots bookingTimeSlots) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long booking_id) {
		// TODO Auto-generated method stub
		
	}

}
