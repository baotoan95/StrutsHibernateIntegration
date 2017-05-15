package com.btit95.sample.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.btit95.sample.forms.User;
import com.btit95.sample.plugin.HibernatePlugin;

public class UserDAOImpl implements IUSerDAO {
    private SessionFactory sessionFactory;
    
    public UserDAOImpl(HttpServletRequest servlet) {
	 sessionFactory = (SessionFactory) servlet.getServletContext().getAttribute(HibernatePlugin.KEY_NAME);
    }

    @SuppressWarnings("unchecked")
    public List<User> findAll() {
	Session session = sessionFactory.openSession();
	Criteria criteria = session.createCriteria(User.class);
	return criteria.list();
    }

}
