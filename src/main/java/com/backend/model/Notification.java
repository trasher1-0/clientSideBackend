package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="notification")
public class Notification {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long notification_id;
	private int to_whome;
	private long customer_id;
	private int is_read;
	private String notification;
	private String date;
	private String time;
	public long getNotification_id() {
		return notification_id;
	}
	public void setNotification_id(long notification_id) {
		this.notification_id = notification_id;
	}
	public int getTo_whome() {
		return to_whome;
	}
	public void setTo_whome(int to_whome) {
		this.to_whome = to_whome;
	}
	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	public int getis_read() {
		return is_read;
	}
	public void setis_read(int is_read) {
		this.is_read = is_read;
	}
	public String getNotification() {
		return notification;
	}
	public void setNotification(String notification) {
		this.notification = notification;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Notification [notification_id=" + notification_id + ", to_whome=" + to_whome + ", customer_id="
				+ customer_id + ", is_read=" + is_read + ", notification=" + notification + ", date=" + date + ", time="
				+ time + "]";
	}
	
	
}
