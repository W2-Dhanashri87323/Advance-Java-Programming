package com.dhanashri.servlets;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dhanashri.daos.BookDao;
import com.dhanashri.entities.Book;
import com.dhanashri.entities.Customer;


@SuppressWarnings({ "serial", "unused" })

@WebServlet("/showcart")
public class ShowCartServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       processRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
	}

	protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //create session
		HttpSession session = req.getSession();
		
		// show the books using session
		 PrintWriter out = resp.getWriter();
		 out.println("<!DOCTYPE html>");
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<meta charset=\"ISO-8859-1\">");
		 out.println("<title> Cart Page</title>");
		 out.println("</head>");
		 out.println("<body>");
		
		out.println("<h2 align='center'> Shopping Cart</h2>");		
		out.println("<table cellpadding='10'>");
		out.println("<tr>");
		out.printf("<th>Id</th>");
		out.printf("<th>Name</th>");
		out.printf("<th>Author</th>");
		out.printf("<th>Subject</th>");
		out.printf("<th>Price</th>");
		out.println("</tr>");
		
		// retrive items from session and display its card
		
		@SuppressWarnings("unchecked")
		List<Integer> items = (List<Integer>) session.getAttribute("items");
		
		try(BookDao bDao = new BookDao()){
			for(Integer id : items) {
		    Book b = bDao.findById(id);
			out.println("<tr>");
			out.printf("<td>%d</td>", id);
			out.printf("<td>%s</td>", b.getName());
			out.printf("<td>%s</td>", b.getAuthor());
			out.printf("<td>%s</td>", b.getSubject());
			out.printf("<td>%f</td>", b.getPrice());
			out.println("</tr>");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
			
		}
		
		out.println("<br>");
		out.println("</table>");	
		out.println("<p><a href='Logout.html'> Sign Out </a></p>\r\n");
		out.println("</body>\r\n"
				+ "</html>");
		
	}

}
