package com.backend.controller;

import java.util.List;

import com.backend.model.BookingTimeSlots;
import com.backend.model.ServiceInvoiceTimeSolts;
import com.backend.model.SocialEventBookingTimeSlots;
import com.backend.model.SocialEventServiceTimeSlots;

public class GetAllTheBookingsController {
	
	private BookingTimeSlots bookingTimeSlots;
	private ServiceInvoiceTimeSolts serviceInvoiceTimeSlots;
	private SocialEventBookingTimeSlots socialEventBookingTimeSlots;
	private SocialEventServiceTimeSlots socialEventServiceTimeSlots;
	private List<BookingTimeSlots> booking_timeSlots;
	private List<ServiceInvoiceTimeSolts> serviceInvoice_timeSlots;
	private List<SocialEventBookingTimeSlots> socialEventBooking_timeSlots;
	private List<SocialEventServiceTimeSlots> SocialEventService_timeSlots;
	
	
	public List<BookingTimeSlots> getAllTheBookingTimeSlots(){
		return null;
	}
	
	public List<ServiceInvoiceTimeSolts> getAllTheServiceInvoiceTimeSlots(){
		return null;
	}
	
	public List<SocialEventBookingTimeSlots> getAllTheServiceEventBookingTimeSlots(){
		return null;
	}
	
	public List<SocialEventServiceTimeSlots> getAllTheSocialEventServiceTimeSlots(){
		return null;
	}
	
	// getters and setters ..
	
	public SocialEventBookingTimeSlots getSocialEventBookingTimeSlots() {
		return socialEventBookingTimeSlots;
	}

	public void setSocialEventBookingTimeSlots(SocialEventBookingTimeSlots socialEventBookingTimeSlots) {
		this.socialEventBookingTimeSlots = socialEventBookingTimeSlots;
	}

	public SocialEventServiceTimeSlots getSocialEventServiceTimeSlots() {
		return socialEventServiceTimeSlots;
	}

	public void setSocialEventServiceTimeSlots(SocialEventServiceTimeSlots socialEventServiceTimeSlots) {
		this.socialEventServiceTimeSlots = socialEventServiceTimeSlots;
	}

	public List<SocialEventBookingTimeSlots> getSocialEventBooking_timeSlots() {
		return socialEventBooking_timeSlots;
	}

	public void setSocialEventBooking_timeSlots(List<SocialEventBookingTimeSlots> socialEventBooking_timeSlots) {
		this.socialEventBooking_timeSlots = socialEventBooking_timeSlots;
	}

	public List<SocialEventServiceTimeSlots> getSocialEventService_timeSlots() {
		return SocialEventService_timeSlots;
	}

	public void setSocialEventService_timeSlots(List<SocialEventServiceTimeSlots> socialEventService_timeSlots) {
		SocialEventService_timeSlots = socialEventService_timeSlots;
	}

	

}
