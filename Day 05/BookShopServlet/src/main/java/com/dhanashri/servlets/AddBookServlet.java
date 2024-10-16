package com.dhanashri.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dhanashri.daos.BookDao;
import com.dhanashri.entities.Book;

@SuppressWarnings("serial")
@WebServlet(value = "/addbook")

public class AddBookServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

	private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		// Content Type HTML
		resp.setContentType("text/html");

		// Fetching the data from Addbook.html
		String name = req.getParameter("name");
		String author = req.getParameter("author");
		String subject = req.getParameter("subject");
		double price = Double.parseDouble(req.getParameter("price"));

		Book b = new Book(0, name, author, subject, price);

		try (BookDao dao = new BookDao()) {
			int count = dao.save(b);

			if (count == 1) {
				RequestDispatcher rd = req.getRequestDispatcher("booklist");
				rd.forward(req, resp);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}

	}
}
