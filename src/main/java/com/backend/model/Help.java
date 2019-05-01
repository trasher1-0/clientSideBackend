package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="help")
public class Help {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long help_id;
	private long customer_id;
	private String help_type;
	private String help;
	
	public long getHelp_id() {
		return help_id;
	}
	public void setHelp_id(long help_id) {
		this.help_id = help_id;
	}
	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	public String getHelp_type() {
		return help_type;
	}
	public void setHelp_type(String help_type) {
		this.help_type = help_type;
	}
	public String getHelp() {
		return help;
	}
	public void setHelp(String help) {
		this.help = help;
	}
	@Override
	public String toString() {
		return "Help [help_id=" + help_id + ", customer_id=" + customer_id + ", help_type=" + help_type + ", help="
				+ help + "]";
	}
	
	
}
