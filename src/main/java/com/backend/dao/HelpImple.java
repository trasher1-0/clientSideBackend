package com.backend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.backend.model.Help;

public class HelpImple implements HelpDAO{
	
	private SessionFactory sessionFactory;

	public long save(Help help) {
		sessionFactory.getCurrentSession().save(help);
		return help.getHelp_id();
	}

	public Help get(long help_id) {
		Help help=sessionFactory.getCurrentSession().get(Help.class,help_id);
		return help ;
	}

	public List<Help> list() {
		List<Help> allHelps=sessionFactory.getCurrentSession().createQuery("form Help").list();
		return allHelps ;
	}

	public void update(long help_id, Help help) {
		Session session=sessionFactory.getCurrentSession();
		Help oldhelp=session.byId(Help.class).load(help_id);
		oldhelp.setHelp(help.getHelp());
		oldhelp.setHelp_type(help.getHelp_type());
		session.flush();
		
	}

	public void delete(long help_id) {
		Session session=sessionFactory.getCurrentSession();
		Help help=session.byId(Help.class).load(help_id);
		session.delete(help);
		
	}

}
