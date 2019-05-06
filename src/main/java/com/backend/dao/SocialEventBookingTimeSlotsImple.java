package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.backend.model.SocialEventBookingTimeSlots;

public class SocialEventBookingTimeSlotsImple implements SocialEventBookingTimeSlotsDAO{

	private SessionFactory sessionFactory;
	public List<SocialEventBookingTimeSlots> allSocialEventBookingTimeSlots;
	
	@Override
	public long save(SocialEventBookingTimeSlots socialEventBookingTimeSlot) {
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
		allSocialEventBookingTimeSlots=sessionFactory.getCurrentSession().createQuery("from SocialEventBookingTimeSlots").list();
		return allSocialEventBookingTimeSlots;
	}

	@Override
	public void update(long booking_id, SocialEventBookingTimeSlots socialEventBookingTimeSlot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long booking_id) {
		// TODO Auto-generated method stub
		
	}

}
