package com.backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.model.BookingTimeSlots;
import com.backend.model.ServiceInvoice;
import com.backend.model.ServiceInvoiceTimeSolts;
import com.backend.model.SocialEventBookingTimeSlots;
import com.backend.model.SocialEventServiceTimeSlots;
import com.backend.service.ServiceInvoiceService;
import com.backend.service.ServiceInvoiceTimeSlotsService;

public class serviceInvoiceController {

	public GetAllTheBookingsController getAllTheBookingsController;
	public ServiceInvoice serviceInvoice;
	public List<ServiceInvoiceTimeSolts> serviceInvoiceTimeSlots;
	public ServiceInvoiceService serviceInvoiceService;
	public ServiceInvoiceTimeSlotsService serviceInvoiceTimeSlotsService;
	
	public List<BookingTimeSlots> booking_timeSlots;
	public List<ServiceInvoiceTimeSolts> serviceInvoice_timeSlots;
	public List<SocialEventBookingTimeSlots> socialEventBooking_timeSlots;
	public List<SocialEventServiceTimeSlots> SocialEventService_timeSlots;
	
	public ResponseEntity<ServiceInvoice> getServiceInvoices(long customer_id){
		return null;
		
	}
	
	@RequestMapping("/customer/serviceInvoice/update/{invoice_id}")
	public ResponseEntity<?> updateServiceInvoiceInfo(@PathVariable long invoice_id,@RequestBody ServiceInvoice serviceInvoice){
		return null;
		
	}
	
	@RequestMapping("/customer/getService")
	public void getAllTheBookings() {
		
		booking_timeSlots=getAllTheBookingsController.getAllTheBookingTimeSlots();
		serviceInvoice_timeSlots=getAllTheBookingsController.getServiceInvoice_timeSlots();
		socialEventBooking_timeSlots=getAllTheBookingsController.getSocialEventBooking_timeSlots();
		SocialEventService_timeSlots=getAllTheBookingsController.getSocialEventService_timeSlots();
		
		// return all the this variables to view as a json object
		
	}
	
	@RequestMapping("/customer/getService/submit")
	public ResponseEntity<?> save(@RequestBody ServiceInvoice serviceInvoice,List<ServiceInvoiceTimeSolts> serviceInvoiceTimeSlots){
		long invoice_id=serviceInvoiceService.save(serviceInvoice);
		serviceInvoiceTimeSlotsService.save(invoice_id,serviceInvoiceTimeSlots);
		return ResponseEntity.ok().body("invoice id :"+serviceInvoice.getInvoice_id());
		
	}
}
