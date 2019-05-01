package com.backend.dao;

import java.util.List;

import com.backend.model.Notification;

public interface NotificationDAO {

	//save the record
		long save(Notification notification);
		
		//get a singel recorde
		 Notification get(long notification_id);
		
		// get all the recode
		List<Notification> list();
		
		// update the recode
		void update(long notification_id,Notification notification);
		
		// delete the recode
		void delete(long notification_id);
}
