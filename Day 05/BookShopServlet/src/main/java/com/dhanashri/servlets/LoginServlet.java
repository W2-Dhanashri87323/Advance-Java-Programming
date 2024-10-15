package com.dhanashri.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dhanashri.daos.CustomerDao;
import com.dhanashri.entities.Customer;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

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
		// session is created
		HttpSession session = req.getSession();

		// get Email and password from request parameters
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		// validate parameters against DB
		try (CustomerDao cdao = new CustomerDao()) {
			Customer dbCust = cdao.findByEmail(email);
		if (dbCust != null && password.equals(dbCust.getPassword())) {
			resp.sendRedirect("subjects");
		

			// store user object into session
			List<Integer> items = new ArrayList<Integer>();
			session.setAttribute("items", items);

			// admin login and user login Redirection
			if (dbCust.getPassword().equals("admin")){		//&& dbCust.getName("admin")) {
				resp.sendRedirect("booklist");
			} else {
				resp.sendRedirect("subjects");
			}
		}
	     else {
				resp.sendRedirect("/BookShopServlet/loginFailed.html");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}

	}
}
