package com.backend.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="serviceInvoice")
public class ServiceInvoice {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long invoice_id;
	private long customer_id;
	private String customer_name;
	private String address;
	private String city;
	
	@OneToMany(mappedBy="serviceInvoice")
	private List<ServiceInvoiceTimeSolts> serviceInvoiceTimeSlots;

	public long getInvoice_id() {
		return invoice_id;
	}

	public void setInvoice_id(long invoice_id) {
		this.invoice_id = invoice_id;
	}

	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<ServiceInvoiceTimeSolts> getServiceInvoiceTimeSlots() {
		return serviceInvoiceTimeSlots;
	}

	public void setServiceInvoiceTimeSlots(List<ServiceInvoiceTimeSolts> serviceInvoiceTimeSlots) {
		this.serviceInvoiceTimeSlots = serviceInvoiceTimeSlots;
	}

	public Object getDate() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getTime_slot() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
