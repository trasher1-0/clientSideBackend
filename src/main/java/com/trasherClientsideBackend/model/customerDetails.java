package com.trasherClientsideBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="customerDetails")

public class customerDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long customer_id;
	private String user_name;
	private String password;
	private String email;
	private String address;
	private String city;
	private long tel;
	private String prof_pic;
	
	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public long getTel() {
		return tel;
	}
	public void setTel(long tel) {
		this.tel = tel;
	}
	public String getProf_pic() {
		return prof_pic;
	}
	public void setProf_pic(String prof_pic) {
		this.prof_pic = prof_pic;
	}
	@Override
	public String toString() {
		return "customerDetails [customer_id=" + customer_id + ", user_name=" + user_name + ", password=" + password
				+ ", email=" + email + ", address=" + address + ", city=" + city + ", tel=" + tel + ", prof_pic="
				+ prof_pic + "]";
	}
	
	
}
