package com.backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.model.Booking;
import com.backend.model.Help;
import com.backend.model.ServiceInvoice;
import com.backend.model.SocialEventBooking;
import com.backend.model.SocialEventService;
import com.backend.model.customerDetails;
import com.backend.model.trasherBuyingInvoice;
import com.backend.service.customerDetailsService;

public class userProfileController {

	// ./customer/profile
	// renderUserProfile(){
			// show all the previous invoices calling showPreviousInvoice()
			// show profile edit section calling editProfile()
			// show all the other activities calling showActivities()
	//}
		
	private loginAndSignup loginAndSignupController;
	private long customer_id;
	private customerDetailsService customer;
	private customerDetails customerInfo,customerDetails;
	private trasherBuyingInvoice buyingInvoices;
	private trasherBuyingController buyingController;
	private List<trasherBuyingInvoice> allBuyingInvoices;
	
	@RequestMapping("/customer/userProfile")
	
	public void renderUserProfile(){
		customer_id=loginAndSignupController.getCustomerId();
		// get all the buying invoices of perticular customer
		allBuyingInvoices= buyingController.getAllInvoices(customer_id);
		// get perticular customer object
		customerDetails=getCustomerDetails(customer_id);
		
		
	}
	
	
	public customerDetails getCustomerDetails(@RequestBody long customer_id){
		customerInfo=customer.get(customer_id);
		return customerInfo;
		
	}
	
	
	@RequestMapping("/customer/userProfile/update")
	public ResponseEntity<?> updateCustomerDetails(long customer_id,@RequestBody customerDetails customerInfo){
		List<customerDetails> customerList =customer.list();
		// check the user details with database
		
		for(int i=0 ;i<customerList.size();i++) {
			if(customerList.get(i).getCustomer_id() != customer_id) {
				if(customerList.get(i).getUser_name() ==customerInfo.getUser_name()) {
					return ResponseEntity.ok().body("user name there exists !");
				}
				if(customer.get(i).getEmail()== customerInfo.getEmail()) {
					return ResponseEntity.ok().body("email there exists !");
				}
			}
		}
		customer.update(customer_id,customerInfo);
		return ResponseEntity.ok().body("sucessfully updated customer "+customer_id);	
	}
}
