package com.backend.service;

import java.util.List;

import com.backend.dao.SocialEventBookingTimeSlotsDAO;
import com.backend.model.SocialEventBookingTimeSlots;

public class SocialEventBookingTimeSlotsServiceImple implements SocialEventBookingTimeSlotsService {

	private SocialEventBookingTimeSlotsDAO socialEventBookingTimeSlotsDAO;
	
	@Override
	public long save(SocialEventBookingTimeSlots socialEventBookingTimeSlots) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SocialEventBookingTimeSlots get(long booking_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SocialEventBookingTimeSlots> list() {
		return socialEventBookingTimeSlotsDAO.list();
	}

	@Override
	public void update(long booking_id, SocialEventBookingTimeSlots socialEventBookingTimeSlots) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long booking_id) {
		// TODO Auto-generated method stub
		
	}

}
