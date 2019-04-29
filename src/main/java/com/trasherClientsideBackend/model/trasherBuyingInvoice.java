package com.trasherClientsideBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="trasherBuyingInvoice")
public class trasherBuyingInvoice {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long invoice_id;
	private String customer_name;
	private String address;
	private String city;
	private int quentity;
	private String date;
	
	public long getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(long invoice_id) {
		this.invoice_id = invoice_id;
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
	public int getQuentity() {
		return quentity;
	}
	public void setQuentity(int quentity) {
		this.quentity = quentity;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "trasherBuyingInvoice [invoice_id=" + invoice_id + ", customer_name=" + customer_name + ", address="
				+ address + ", city=" + city + ", quentity=" + quentity + ", date=" + date + "]";
	}
	
	

}
