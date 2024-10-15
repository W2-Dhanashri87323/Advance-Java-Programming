package com.dhanashri.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogOutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

	protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		//destroy the session 
		HttpSession session = req.getSession();
		session.invalidate();
		
	     PrintWriter out = resp.getWriter();
	     out.println("<!DOCTYPE html>\r\n"
	     		+ "<html>\r\n"
	     		+ "<head>\r\n"
	     		+ "<meta charset=\"ISO-8859-1\">\r\n"
	     		+ "<title>Logout Page</title>\r\n"
	     		+ "</head>\r\n"
	     		+ "<body>\r\n"
	     		+ "	<h2 align= 'center'>Logged out Successfully ! </h2>\r\n"
	     		+ "	<h2 align= 'center'>Thank You </h2>\r\n"
	     		+ "	<p align= 'center'>\r\n"
	     		+ "		<a href=\"Login.html\">Login Again</a>\r\n"
	     		+ "	</p>\r\n"
	     		+ "</body>\r\n"
	     		+ "</html>");
	     
	}
		
	}
