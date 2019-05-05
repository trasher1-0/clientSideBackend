package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="SocialEventServiceTimeSlots")
public class SocialEventServiceTimeSlots {

	@Id
	
	private long invoice_id;
	private String date;
	private String time_slot;
	private int is_verified;
	
	@ManyToOne
	private SocialEventService socialEventService;

	public long getInvoice_id() {
		return invoice_id;
	}

	public void setInvoice_id(long invoice_id) {
		this.invoice_id = invoice_id;
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

	public int getIs_verified() {
		return is_verified;
	}

	public void setIs_verified(int is_verified) {
		this.is_verified = is_verified;
	}

	public SocialEventService getSocialEventService() {
		return socialEventService;
	}

	public void setSocialEventService(SocialEventService socialEventService) {
		this.socialEventService = socialEventService;
	}

	@Override
	public String toString() {
		return "SocialEventServiceTimeSlots [invoice_id=" + invoice_id + ", date=" + date + ", time_slot=" + time_slot
				+ ", is_verified=" + is_verified + ", socialEventService=" + socialEventService + "]";
	}
	
	
}
