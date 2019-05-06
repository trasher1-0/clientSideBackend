package com.backend.service;

import java.util.List;

import com.backend.dao.BookingTimeSlotsDAO;
import com.backend.model.BookingTimeSlots;

public class BookingTimeSlotsServiceImple implements BookingTimeSlotsService {

	private BookingTimeSlotsDAO bookingTimeSlotsDAO;
	
	@Override
	public long save(BookingTimeSlots bookingTimeSlot) {
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
		return bookingTimeSlotsDAO.list();
	}

	@Override
	public void update(long booking_id, BookingTimeSlots bookingTimeSlot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long booking_id) {
		// TODO Auto-generated method stub
		
	}

}
