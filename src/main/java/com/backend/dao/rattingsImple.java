package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.backend.model.rattings;

public class rattingsImple implements rattingsDAO{

	private SessionFactory sessionFactory;
	private rattings ratting;
	
	
	public long saveSmallTrasherRattings(rattings ratting) {
		sessionFactory.getCurrentSession().save(ratting);
		return ratting.getCustomer_id();
		
	}
	
	public long savePrimumTrasherRattings(rattings ratting) {
		sessionFactory.getCurrentSession().save(ratting);
		return ratting.getCustomer_id();
	}

	public long saveLargeTrasherRattings(rattings ratting) {
		sessionFactory.getCurrentSession().save(ratting);
		return ratting.getCustomer_id();
	}
	public rattings get(long customer_id) {
		rattings ratting=sessionFactory.getCurrentSession().get(rattings.class,customer_id);
		return ratting;
	}

	public List<rattings> list() {
		List<rattings> allRattings=sessionFactory.getCurrentSession().createQuery("from rattings").list();
		return allRattings;
	}

	public void update(long customer_id, rattings ratting) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long customer_id) {
		// TODO Auto-generated method stub
		
	}

}
