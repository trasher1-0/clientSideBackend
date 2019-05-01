package com.clientBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// initialize the entity to hibernate and given the name of purticular entity
@Entity(name="rattings")

public class rattings {

	// initialize the primarykey
		@Id
	// initialize the autoincrement
	//	@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private long customer_id;
		private int trasher_type;
		private int rated_value;
		
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
		public int getRated_value() {
			return rated_value;
		}
		public void setRated_value(int rated_value) {
			this.rated_value = rated_value;
		}
		@Override
		public String toString() {
			return "rattings [customer_id=" + customer_id + ", trasher_type=" + trasher_type + ", rated_value="
					+ rated_value + "]";
		}

		
		
}
