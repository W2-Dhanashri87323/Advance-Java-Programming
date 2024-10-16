package com.dhanashri.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dhanashri.daos.BookDao;
import com.dhanashri.entities.Book;

@SuppressWarnings("serial")
@WebServlet(value = "/editbook")
public class EditBookServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String bookId = req.getParameter("bookId");
		int id = Integer.parseInt(bookId);

		try (BookDao dao = new BookDao()) {
			Book bk = dao.findById(id);
			out.printf("<!DOCTYPE html>\r\n");
			out.printf("<html>\r\n");
			out.printf("<head>\r\n");
			out.printf("<title>New Book</title>\r\n");
			out.printf("</head>\r\n");

			out.printf("<hr><h3 align='center'>UPDATE BOOK DETAILS</h3>r\n");

			out.printf("<table cellpadding='10'>\r\n");
			out.printf("<tr><td><button><a href='booklist'>Go Back</a></button></td><td></td><tr>\r\n");
			out.printf("</table>");
			out.printf("<form method='post' action='editbook'>\r\n");

			out.printf("<fieldset>\r\n");
			out.printf("<table cellpadding='10'>\r\n");
			out.printf(
					"<tr><td><b>Book ID</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:</td><td><input type='text' name='id' value='%d' readonly/></td></tr>\r\n",
					bk.getId());
			out.printf(
					"<tr><td><b>Book Name</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:</td><td><input type='text' name='name' value='%s'/></td></tr>\r\n",
					bk.getName());
			out.printf(
					"<tr><td><b>Book Author</b>&nbsp;&nbsp;&nbsp;:</td><td><input type='text' name='author' value='%s'/></td></tr>\r\n",
					bk.getAuthor());
			out.printf(
					"<tr><td><b>Book Subject</b>&nbsp;&nbsp;:</td><td><input type='text' name='subject' value='%s'/></td></tr>\r\n",
					bk.getSubject());
			out.printf(
					"<tr><td><b>Book Price</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:</td><td><input type='text' name='price' value='%f'/></td></tr>\r\n",
					bk.getPrice());

			out.printf("<tr><td> </td><td><input type='submit' value='Update Book'/></td></tr>\r\n");

			out.printf("</table>\r\n");
			out.printf("</fieldset>\r\n");

			out.printf("<br/>\r\n");

			out.printf("</form>\r\n");
			out.printf("</body>\r\n");
			out.printf("</html>\r\n");

		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String author = req.getParameter("author");
		String subject = req.getParameter("subject");
		double price = Double.parseDouble(req.getParameter("price"));
		
		Book b = new Book(id, name, author, subject, price);
		
		try(BookDao dao2 = new BookDao()){
			int count = dao2.update(b);
			String message = "BOOK UPDATED ::" + count ;
			req.setAttribute("msg" , message); //scope request 		
		}catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	}

}
