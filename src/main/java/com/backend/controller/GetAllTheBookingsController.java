package com.backend.controller;

import java.util.List;

import com.backend.model.BookingTimeSlots;
import com.backend.model.ServiceInvoiceTimeSolts;
import com.backend.model.SocialEventBookingTimeSlots;
import com.backend.model.SocialEventServiceTimeSlots;
import com.backend.service.BookingTimeSlotsService;
import com.backend.service.ServiceInvoiceTimeSlotsService;
import com.backend.service.SocialEventBookingTimeSlotsService;
import com.backend.service.SocialEventServiceTimeSlotsService;

public class GetAllTheBookingsController {
	
	
	private List<BookingTimeSlots> booking_timeSlots;
	private List<ServiceInvoiceTimeSolts> serviceInvoice_timeSlots;
	private List<SocialEventBookingTimeSlots> socialEventBooking_timeSlots;
	private List<SocialEventServiceTimeSlots> SocialEventService_timeSlots;
	
	private BookingTimeSlotsService bookingTimeSlotService;
	private ServiceInvoiceTimeSlotsService serviceInvoiceTimeSlotService;
	private SocialEventServiceTimeSlotsService socialEventServiceTimeSlotsService;
	private SocialEventBookingTimeSlotsService socialEventBookingTimeSlotsService;
	
	public List<BookingTimeSlots> getAllTheBookingTimeSlots(){
		booking_timeSlots=bookingTimeSlotService.list();
		return booking_timeSlots;
	}
	
	public List<ServiceInvoiceTimeSolts> getAllTheServiceInvoiceTimeSlots(){
		serviceInvoice_timeSlots=serviceInvoiceTimeSlotService.list();
		return serviceInvoice_timeSlots;
	}
	
	public List<SocialEventBookingTimeSlots> getAllTheServiceEventBookingTimeSlots(){
		socialEventBooking_timeSlots=socialEventBookingTimeSlotsService.list();
		return socialEventBooking_timeSlots;
	}
	
	public List<SocialEventServiceTimeSlots> getAllTheSocialEventServiceTimeSlots(){
		SocialEventService_timeSlots=socialEventServiceTimeSlotsService.list();
		return SocialEventService_timeSlots;
	}

	// getters and setters
	
	
	public List<BookingTimeSlots> getBooking_timeSlots() {
		return booking_timeSlots;
	}

	public void setBooking_timeSlots(List<BookingTimeSlots> booking_timeSlots) {
		this.booking_timeSlots = booking_timeSlots;
	}

	public List<ServiceInvoiceTimeSolts> getServiceInvoice_timeSlots() {
		return serviceInvoice_timeSlots;
	}

	public void setServiceInvoice_timeSlots(List<ServiceInvoiceTimeSolts> serviceInvoice_timeSlots) {
		this.serviceInvoice_timeSlots = serviceInvoice_timeSlots;
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

	public BookingTimeSlotsService getBookingTimeSlotService() {
		return bookingTimeSlotService;
	}

	public void setBookingTimeSlotService(BookingTimeSlotsService bookingTimeSlotService) {
		this.bookingTimeSlotService = bookingTimeSlotService;
	}

	public ServiceInvoiceTimeSlotsService getServiceInvoiceTimeSlotService() {
		return serviceInvoiceTimeSlotService;
	}

	public void setServiceInvoiceTimeSlotService(ServiceInvoiceTimeSlotsService serviceInvoiceTimeSlotService) {
		this.serviceInvoiceTimeSlotService = serviceInvoiceTimeSlotService;
	}

	public SocialEventServiceTimeSlotsService getSocialEventServiceTimeSlotsService() {
		return socialEventServiceTimeSlotsService;
	}

	public void setSocialEventServiceTimeSlotsService(
			SocialEventServiceTimeSlotsService socialEventServiceTimeSlotsService) {
		this.socialEventServiceTimeSlotsService = socialEventServiceTimeSlotsService;
	}

	public SocialEventBookingTimeSlotsService getSocialEventBookingTimeSlotsService() {
		return socialEventBookingTimeSlotsService;
	}

	public void setSocialEventBookingTimeSlotsService(
			SocialEventBookingTimeSlotsService socialEventBookingTimeSlotsService) {
		this.socialEventBookingTimeSlotsService = socialEventBookingTimeSlotsService;
	}
	
	
	

	

}
