package com.dhanashri.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dhanashri.daos.BookDao;



@SuppressWarnings("serial")
@WebServlet(value = "/delbook")
public class DeleteBookServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String bookId= req.getParameter("bookId");
			int id = Integer.parseInt(bookId);
			
			try(BookDao dao = new BookDao()){
			     int count = dao.deleteById(id);
			     String message = "BOOK DELETED :: " + count ;
			     System.out.println(message);
			     
			     req.setAttribute("msg", message); // request to request scope 
				
			}catch (Exception e) {
				e.printStackTrace();
				throw new ServletException(e);
			}
	
	
	}
	
}