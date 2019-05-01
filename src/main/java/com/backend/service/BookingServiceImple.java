package com.backend.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.backend.dao.BookingDAO;
import com.backend.model.Booking;

public class BookingServiceImple implements BookingService{
	
	@Autowired
	private BookingDAO bookingDAO;

	@Override
	@Transactional
	public long save(Booking booking) {
		// TODO Auto-generated method stub
		return bookingDAO.save(booking);
	}

	public Booking get(long booking_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Booking> list() {
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
