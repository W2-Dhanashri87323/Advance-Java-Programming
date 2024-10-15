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

@SuppressWarnings("serial")
@WebServlet("/subjects")
public class SubjectServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

	protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// fetching all subjects and printing them

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>\r\n" 
		        + "<html>\r\n"
				+ "<head>\r\n" 
		        + "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Subjects Page</title>\r\n" 
		        + "</head>\r\n" 
				+ "<body>\r\n" 
		        + "<h1 align= 'center' >Subjects</h1>\r\n" 
				+ "\r\n"
				+ "<form action=\"books\" method =\"post\">");

		try (BookDao bkDao = new BookDao()) {
			List<String> list = bkDao.findAllSubjects();
			for (String subject : list) {
				out.printf("<input type = 'radio' name ='subject' value= '%s' /> %s", subject, subject);
				out.printf("<br>");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);

		}

		out.println("<input type = 'submit' value = 'show Books'>\n");
		out.println("<p> <a href = 'showcart' > Show Card </a> </p> \n\n");
		out.println("</form>\r\n" + "</body>\r\n" + "</html>");

	}

}
