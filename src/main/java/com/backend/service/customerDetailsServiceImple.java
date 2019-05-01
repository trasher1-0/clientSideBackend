package com.backend.service;

import java.util.List;

import com.backend.model.customerDetails;

import com.backend.dao.customerDetailsDAO;

public class customerDetailsServiceImple implements customerDetailsService{
	
	private customerDetailsDAO customerDetailsDAO;

	public long save(customerDetails customerDetails) {
		return customerDetailsDAO.save(customerDetails);
	}

	public customerDetails get(long customet_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<customerDetails> list() {
		// TODO Auto-generated method stub
		return customerDetailsDAO.list();
	}

	public void update(long customer_id, customerDetails customerDetails) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long customer_id) {
		// TODO Auto-generated method stub
		
	}

}
