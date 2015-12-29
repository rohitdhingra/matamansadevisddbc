package com.matamansadevisdbc;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action{
	
	private final static String ADMIN = "admin";
	private final static String MEMBER = "member";
	private final static String HOME = "home";
	private final static String FAILURE = "failure";

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		/*DataSource dataSource=null;
		Connection connection=null;
		dataSource = getDataSource(request);
		connection = dataSource.getConnection();*/
//		System.out.println(connection.toString());
		System.out.println("Inside Action Servlet================================");
		LoginForm loginForm = (LoginForm) form;
		System.out.println(loginForm.getMemberType() + loginForm.getUserName()+loginForm.getPassword());
		if (loginForm.getUserName().equals(loginForm.getPassword())) {
			if(loginForm.getMemberType().trim().equals("Admin"))
			{
				return mapping.findForward(ADMIN);
			}
			else if(loginForm.getMemberType().trim().equals("Member"))
			{
				return mapping.findForward(MEMBER);
			}
			else
				return mapping.findForward(HOME);
			
		} else {
			
			return mapping.findForward(FAILURE);
		}
	}
}
