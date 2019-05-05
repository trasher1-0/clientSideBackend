package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="BookingTimeSlots")

public class BookingTimeSlots {

		@Id
		
		@ManyToOne
		private Booking booking;
		
		
		private long booking_id;
		private String date;
		private String time_slots;
		private int is_verified;
		

		public Booking getBooking() {
			return booking;
		}
		public void setBooking(Booking booking) {
			this.booking = booking;
		}
		
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
		public String getTime_slots() {
			return time_slots;
		}
		public void setTime_slots(String time_slots) {
			this.time_slots = time_slots;
		}
		public int getIs_verified() {
			return is_verified;
		}
		public void setIs_verified(int is_verified) {
			this.is_verified = is_verified;
		}
		@Override
		public String toString() {
			return "BookingTimeSlots [booking_id=" + booking_id + ", date=" + date + ", time_slots=" + time_slots
					+ ", is_verified=" + is_verified + "]";
		}
		
		
		
		
}
