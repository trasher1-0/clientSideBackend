package com.backend.service;

import java.util.List;

import com.backend.dao.SocialEventServiceTimeSlotDAO;
import com.backend.model.SocialEventServiceTimeSlots;

public class SocialEventServiceTimeSlotsServiceImple implements SocialEventServiceTimeSlotsService{

	private SocialEventServiceTimeSlotDAO socialEventServiceTimeSlotDAO;
	
	@Override
	public long save(SocialEventServiceTimeSlots socialEventServiceTimeSlots) {
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
		return socialEventServiceTimeSlotDAO.list();
	}

	@Override
	public void update(long invoce_id, SocialEventServiceTimeSlots socialEventServiceTimeSlots) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long invoice_id) {
		// TODO Auto-generated method stub
		
	}

}
