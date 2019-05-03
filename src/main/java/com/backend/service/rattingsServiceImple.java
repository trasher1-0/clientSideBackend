package com.backend.service;

import java.util.List;

import com.backend.dao.rattingsDAO;
import com.backend.model.rattings;

public class rattingsServiceImple implements rattingsService{
	
	private rattingsDAO rattingDAO;

	
	public long saveSmallTrasherRattings(rattings ratting) {
		 return rattingDAO.saveSmallTrasherRattings(ratting);
		
	}
	
	public long savePrimumTrasherRattings(rattings ratting) {
		return rattingDAO.savePrimumTrasherRattings(ratting);
	}
	
	public long saveLargeTrasherRattings(rattings ratting) {
		return rattingDAO.saveLargeTrasherRattings(ratting);
	}

	public rattings get(long customer_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<rattings> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(long customer_id, rattings ratting) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long customer_id) {
		// TODO Auto-generated method stub
		
	}

	
}
