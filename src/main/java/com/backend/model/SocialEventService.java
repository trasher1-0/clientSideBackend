package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="socialEvent")
public class SocialEventService {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long invoce_id;
	private long customer_id;
	private String customer_name;
	private String address;
	private String city;
	private String date;
	private String time_slot;
	
	public long getInvoce_id() {
		return invoce_id;
	}
	public void setInvoce_id(long invoce_id) {
		this.invoce_id = invoce_id;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime_slot() {
		return time_slot;
	}
	public void setTime_slot(String time_slot) {
		this.time_slot = time_slot;
	}
	@Override
	public String toString() {
		return "SocialEventService [invoce_id=" + invoce_id + ", customer_id=" + customer_id + ", customer_name="
				+ customer_name + ", address=" + address + ", city=" + city + ", date=" + date + ", time_slot="
				+ time_slot + "]";
	}
	
	
}
