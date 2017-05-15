package com.btit95.sample.plugin;

import java.net.URL;

import javax.servlet.ServletException;

import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernatePlugin implements PlugIn {
    private Configuration configuration;
    private SessionFactory sessionFactory;
    private String path = "/hibernate.cfg.xml";
    private static Class<HibernatePlugin> clazz = HibernatePlugin.class;
    
    public static final String KEY_NAME = clazz.getName();

    public void destroy() {
	sessionFactory.close();
    }

    public void init(ActionServlet servlet, ModuleConfig config) throws ServletException {
	URL url = HibernatePlugin.class.getResource(path);
	configuration = new Configuration().configure(url);
	sessionFactory = configuration.buildSessionFactory();
	servlet.getServletContext().setAttribute(KEY_NAME, sessionFactory);
    }

}
