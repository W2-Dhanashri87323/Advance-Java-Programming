package com.dhanashri.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dhanashri.daos.BookDao;
import com.dhanashri.entities.Book;


@SuppressWarnings("serial")
@WebServlet("/books")
public class BooksServlet extends HttpServlet {
	
  @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 processRequest(req, resp);
    }

  @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  processRequest(req, resp);
	}
  
   protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	   //from previous page subject is request parameter 
	   
	   String subject = req.getParameter("subject");
	   
	   //By using selected subject books will be shown
	   
	   resp.setContentType("text/html");
	   
	   PrintWriter out = resp.getWriter();
	   out.println("<!DOCTYPE html>\r\n"
	   		+ "<html>\r\n"
	   		+ "<head>\r\n"
	   		+ "<meta charset=\"ISO-8859-1\">\r\n"
	   		+ "<title>Books Page</title>\r\n"
	   		+ "</head>\r\n"
	   		+ "<body>\r\n"
	   		+ "<h1 align='center'>Books</h1>\r\n"
	   		+ "\r\n"
	   		+ "<form action=\"addToCart\" method =\"post\">");
	   
	   try(BookDao bkDao = new BookDao()){
		    List<Book> list=  bkDao.findBySubject(subject);
		    for(Book book : list) {
				out.printf("<input type='checkbox' name='book' value='%d'/> %s - %s", book.getId(), book.getName(), book.getAuthor());
		    	out.printf("<br>");
		    }
		   
	   } catch (Exception e) {
		   e.printStackTrace();
		   throw new ServletException(e);
		   
	   }
	   
	   out.println("<input type = 'submit' value = 'addToCart'>\n");
	   out.println("<p> <a href = 'showcart' > Show Card </a> </p> \n\n");
	   out.println("</form>\r\n"
	   		+ "</body>\r\n"
	   		+ "</html>");
	   
      
	   
   }
  
}

