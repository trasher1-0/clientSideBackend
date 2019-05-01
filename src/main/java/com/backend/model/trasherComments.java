package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="trasherComments")
public class trasherComments {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long comment_id;
	private long customer_id;
	private int trasher_type;
	private String comment;
	public long getComment_id() {
		return comment_id;
	}
	public void setComment_id(long comment_id) {
		this.comment_id = comment_id;
	}
	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	public int getTrasher_type() {
		return trasher_type;
	}
	public void setTrasher_type(int trasher_type) {
		this.trasher_type = trasher_type;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "trasherComments [comment_id=" + comment_id + ", customer_id=" + customer_id + ", trasher_type="
				+ trasher_type + ", comment=" + comment + "]";
	}
	
	

}
