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
@WebServlet(value = "/booklist")
public class BookListServlet extends HttpServlet {
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
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Books List Page</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<hr>");
		out.println("<h3><center>ADMIN PANEL<center></h3>");
		out.println("<hr>");

		try (BookDao bDao = new BookDao()) {
			List<Book> list = bDao.findAll();
			out.println("<center>");
			out.println("<fieldset>");
			out.println("<table border='1' cellpadding='10'>");
			out.println("<thead>");
			out.printf("<th>ID</th>");
			out.printf("<th>NAME</th>");
			out.printf("<th>AUTHOR</th>");
			out.printf("<th>SUBJECT</th>");
			out.printf("<th>PRICE</th>");
			out.printf("<th>EDIT</th>");
			out.printf("<th>DELETE</th>");
			out.println("</thead>");
			
		for(Book book : list) {
			out.println("<tr>");
			out.printf("<td>%d</td>", book.getId());
			out.printf("<td>%s</td>", book.getName());
			out.printf("<td>%s</td>", book.getAuthor());
			out.printf("<td>%s</td>", book.getSubject());
			out.printf("<td>%f</td>", book.getPrice());
			
			out.printf(
		"<td align='center'><a href='editbook?bookId=%d'><img src='images/edit.jpg' alt='Edit' width='26' height='26'/></a></td>", book.getId());
			out.printf(
		"<td align='center'><a href='delbook?bookId=%d'><img src='images/delete.png' alt='Delete' width='28' height='28'/></a></td>",book.getId());
			out.println("</tr>");
		}

		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
		
		out.println("<table>");
		String msg = (String) req.getAttribute("msg"); // request to request scope 
		if(msg!= null) {
			out.println("<h4>" + msg +"<h4>");
		}
		out.println("</fieldset>");

		out.println("</center>");
		out.println("<br>");
		out.printf("<table align='center' cellpadding='10'>\r\n");
		out.printf("<tr>\r\n");

		out.printf("<td>\r\n");
		out.printf("<p><a href='/BookShopServlet/LogOutServlet'><button>Sign Out</button></a></p>\r\n");
		out.printf("</td>\r\n");

		out.printf("<td>\r\n");
		out.printf("<p><a href='/BookShopServlet/AddBook.html'><button>Add Book</button></a></p>\r\n");
		out.printf("</td>\r\n");

		out.printf("</tr>\r\n");
		out.printf("</table>\r\n");

		out.println("</body>");
		out.println("</html>");
		

	}

}
