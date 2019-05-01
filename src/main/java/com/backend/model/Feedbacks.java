package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;

@Entity(name="feedback")
public class Feedbacks {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long feedback_id;
	private long customer_id;
	private String feedback;
	public long getFeedback_id() {
		return feedback_id;
	}
	public void setFeedback_id(long feedback_id) {
		this.feedback_id = feedback_id;
	}
	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "Feedbacks [feedback_id=" + feedback_id + ", customer_id=" + customer_id + ", feedback=" + feedback
				+ "]";
	}
	
	
}
