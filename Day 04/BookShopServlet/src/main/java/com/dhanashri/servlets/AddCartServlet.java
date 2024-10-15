package com.dhanashri.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/addToCart")
public class AddCartServlet extends HttpServlet {

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
		// fetch books from bookServlet and add to card
		@SuppressWarnings("unused")
		String[] bookId = req.getParameterValues("book");
		
		HttpSession session = req.getSession();
		@SuppressWarnings("unchecked")
		List<Integer> items = (List<Integer>) session.getAttribute("items");
		
		
		
		for (String string : bookId) {
			int id = Integer.parseInt(string);
			items.add(id);
		}

		RequestDispatcher rd = req.getRequestDispatcher("subjects");
		rd.forward(req, resp);

	}

}
