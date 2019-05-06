package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.backend.model.SocialEventServiceTimeSlots;

public class SocialEventServiceTimeSlotImple implements SocialEventServiceTimeSlotDAO{
	
	private SessionFactory sessionFactory;
	public List<SocialEventServiceTimeSlots> allSocialEventServiceTimeSlots;

	@Override
	public long save(SocialEventServiceTimeSlots socialEventServiceTimeSlot) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SocialEventServiceTimeSlots get(long invoice_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SocialEventServiceTimeSlots> list() {
		allSocialEventServiceTimeSlots=sessionFactory.getCurrentSession().createQuery("from SocialEventServiceTimeSlots").list();
		return allSocialEventServiceTimeSlots;
	}

	@Override
	public void update(long invoice_id, SocialEventServiceTimeSlots socialEventServiceTimeSlot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long invoice_id) {
		// TODO Auto-generated method stub
		
	}

}
