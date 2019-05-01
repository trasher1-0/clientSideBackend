package com.backend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.backend.model.Notification;

public class NotificationImple implements NotificationDAO{

	private SessionFactory sessionFactory;
	
	public long save(Notification notification) {
		sessionFactory.getCurrentSession().save(notification);
		return notification.getNotification_id();
	}

	public Notification get(long notification_id) {
		Notification notification=sessionFactory.getCurrentSession().get(Notification.class,notification_id);
		return notification;
	}

	public List<Notification> list() {
		List<Notification> allNotifications=sessionFactory.getCurrentSession().createQuery("from Notification").list();
		return allNotifications;
	}

	public void update(long notification_id, Notification notification) {
		Session session = (Session) sessionFactory.getCurrentSession();
		Notification oldnotification=session.byId(Notification.class).load(notification_id);
		oldnotification.setCustomer_id(notification.getCustomer_id());
		oldnotification.setDate(notification.getDate());
		oldnotification.setis_read(notification.getis_read());
		oldnotification.setNotification(notification.getNotification());
		oldnotification.setTime(notification.getTime());
		oldnotification.setTo_whome(notification.getTo_whome());
		session.flush();
		
	}

	public void delete(long notification_id) {
		Session session=sessionFactory.getCurrentSession();
		Notification notification=session.byId(Notification.class).load(notification_id);
		session.delete(notification);
		
	}

}
