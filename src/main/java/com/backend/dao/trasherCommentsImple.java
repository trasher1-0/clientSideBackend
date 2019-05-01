package com.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.backend.model.trasherComments;
import com.mysql.cj.api.Session;

public class trasherCommentsImple implements trasherCommentsDAO {

	private SessionFactory sessionFactory;
	
	public long save(trasherComments trasherComment) {
		sessionFactory.getCurrentSession().save(trasherComment);
		return trasherComment.getComment_id();
	}

	public trasherComments get(long comment_id) {
		trasherComments trasherComment=sessionFactory.getCurrentSession().get(trasherComments.class, comment_id);
		return trasherComment;
	}

	public List<trasherComments> list() {
		List<trasherComments> allComments=sessionFactory.getCurrentSession().createQuery("from trasherComments").list();
		return allComments;
	}

	public void update(long comment_id, trasherComments trasherComment) {
		Session session =(Session) sessionFactory.getCurrentSession();
		trasherComments oldComment=((org.hibernate.Session) session).byId(trasherComments.class).load(comment_id);
		oldComment.setComment(trasherComment.getComment());
		oldComment.setCustomer_id(trasherComment.getComment_id());
		oldComment.setTrasher_type(trasherComment.getTrasher_type());
		((org.hibernate.Session) session).flush();
	}

	public void delete(long comment_id) {
		Session session =(Session) sessionFactory.getCurrentSession();
		trasherComments trasherComment=((org.hibernate.Session) session).byId(trasherComments.class).load(comment_id);
		((org.hibernate.Session) session).delete(trasherComment);
	}

}
