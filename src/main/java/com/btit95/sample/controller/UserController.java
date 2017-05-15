package com.btit95.sample.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import com.btit95.sample.dao.IUSerDAO;
import com.btit95.sample.dao.UserDAOImpl;

public class UserController extends MappingDispatchAction {
    private IUSerDAO userDAO;
    
    public ActionForward allUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
	    HttpServletResponse response) {
	userDAO = new UserDAOImpl(request);
	System.out.println(userDAO.findAll().size());
	request.setAttribute("users", userDAO.findAll());
	return mapping.findForward("page");
    }
}
