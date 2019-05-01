package com.backend.dao;

import java.util.List;

import com.backend.model.customerDetails;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.cj.api.Session;


public class customerDetailsImple implements customerDetailsDAO {

	private SessionFactory sessionFactory;
	
	public long save(customerDetails customerDetails) {
		sessionFactory.getCurrentSession().save(customerDetails);
		return customerDetails.getCustomer_id();
	}

	public customerDetails get(long customer_id) {
		return sessionFactory.getCurrentSession().get(customerDetails.class,customer_id);
	}

	public List<customerDetails> list() {

		List<customerDetails> customerList=sessionFactory.getCurrentSession().createQuery("from customerDetails").list();
		return customerList;
	}

	public void update(long customer_id, customerDetails customerDetails) {
		Session session = (Session) sessionFactory.getCurrentSession();
		customerDetails oldCustomer=((org.hibernate.Session) session).byId(customerDetails.class).load(customer_id);
		oldCustomer.setUser_name(customerDetails.getUser_name());
		oldCustomer.setPassword(customerDetails.getPassword());
		oldCustomer.setEmail(customerDetails.getEmail());
		oldCustomer.setCity(customerDetails.getCity());
		oldCustomer.setTel(customerDetails.getTel());
		oldCustomer.setProf_pic(customerDetails.getProf_pic());
		((org.hibernate.Session) session).flush();
	}

	public void delete(long customer_id) {
		
		Session session = (Session) sessionFactory.getCurrentSession();
		customerDetails customerDetails=((org.hibernate.Session) session).byId(customerDetails.class).load(customer_id);
		((org.hibernate.Session) session).delete(customerDetails);
	}

}
