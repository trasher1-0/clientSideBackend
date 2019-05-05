package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="SocialEventBookingTimeSlots")
public class SocialEventBookingTimeSlots {
	
	@Id
	
	private long booking_id;
	private String date;
	private String time_slot;
	private int is_verifed;
	
	@ManyToOne
	private SocialEventBooking socialEventBooking;

	public long getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(long booking_id) {
		this.booking_id = booking_id;
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

	public int getIs_verifed() {
		return is_verifed;
	}

	public void setIs_verifed(int is_verifed) {
		this.is_verifed = is_verifed;
	}

	public SocialEventBooking getSocialEventBooking() {
		return socialEventBooking;
	}

	public void setSocialEventBooking(SocialEventBooking socialEventBooking) {
		this.socialEventBooking = socialEventBooking;
	}

	@Override
	public String toString() {
		return "SocialEventBookingTimeSlots [booking_id=" + booking_id + ", date=" + date + ", time_slot=" + time_slot
				+ ", is_verifed=" + is_verifed + ", socialEventBooking=" + socialEventBooking + "]";
	}
	
	
	
}
