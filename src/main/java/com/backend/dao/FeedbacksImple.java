package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.backend.model.Feedbacks;
import com.mysql.cj.api.Session;

public class FeedbacksImple implements FeedbacksDAO {

	private SessionFactory sessionFactory;
	
	public long save(Feedbacks feedback) {
		Feedbacks newfeedback=(Feedbacks) sessionFactory.getCurrentSession().save(feedback);
		return newfeedback.getFeedback_id();
	}

	public Feedbacks get(long feedback_id) {
		Feedbacks feedback=sessionFactory.getCurrentSession().get(Feedbacks.class,feedback_id);
		return feedback;
	}

	public List<Feedbacks> list() {
		List<Feedbacks> allFeedbacks=sessionFactory.getCurrentSession().createQuery("form Feedbacks").list();
		return allFeedbacks;
	}

	public void update(long feedback_id, Feedbacks feedback) {
		Session session=(Session) sessionFactory.getCurrentSession();
		Feedbacks oldfeedback=((org.hibernate.Session) session).byId(Feedbacks.class).load(feedback_id);
		oldfeedback.setFeedback(feedback.getFeedback());
		((org.hibernate.Session) session).flush();
	}

	public void delete(long feedback_id) {
		Session session=(Session) sessionFactory.getCurrentSession();
		Feedbacks feedback=((org.hibernate.Session) session).byId(Feedbacks.class).load(feedback_id);
		((org.hibernate.Session) session).delete(feedback);
	}

}
