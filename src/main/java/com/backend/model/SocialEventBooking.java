package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="socialEventBooking")
public class SocialEventBooking {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long booking_id;
	private long customer_id;
	private String customer_name;
	private String address;
	private String city;
	private String date;
	private int time_slot;
	public long getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(long booking_id) {
		this.booking_id = booking_id;
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
	public int getTime_slot() {
		return time_slot;
	}
	public void setTime_slot(int time_slot) {
		this.time_slot = time_slot;
	}
	@Override
	public String toString() {
		return "SocialEventBooking [booking_id=" + booking_id + ", customer_id=" + customer_id + ", customer_name="
				+ customer_name + ", address=" + address + ", city=" + city + ", date=" + date + ", time_slot="
				+ time_slot + "]";
	}
	
	
}
