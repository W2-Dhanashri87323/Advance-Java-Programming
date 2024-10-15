package com.dhanashri.servlets;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dhanashri.daos.CustomerDao;
import com.dhanashri.entities.Customer;



@SuppressWarnings("serial")
@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 	processRequest(req, resp);
 	
 }
    
    @Override
 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 	processRequest(req, resp);
 }
    
 protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
     //get Email and password from request parameters
	 
	String name = req.getParameter("name"); 
 	String email = req.getParameter("email");
 	String password = req.getParameter("password");
 	String mobile = req.getParameter("mobile"); 
 	String birth = req.getParameter("birth");
 	Date date = Date.valueOf(birth);
 	String address = req.getParameter("address");
 	
 	//add parameters into DB
 	
 	Customer c = new Customer(0, name, email, password, mobile, date, address);
 	try(CustomerDao cdao = new CustomerDao()){
 	  int count = cdao.save(c);
 		
 	  if(count ==1) {
 		  System.out.println("New Customer Added !");
 	  }else {
 		  System.out.println("customer save failed !");
 	  }
 		
 	}
    catch(Exception e) {
		e.printStackTrace();
		throw new ServletException(e);
	}
	
 	
 }
}
