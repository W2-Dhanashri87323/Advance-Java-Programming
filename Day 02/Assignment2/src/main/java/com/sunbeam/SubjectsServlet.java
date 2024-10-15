package com.sunbeam;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/Subjects")
public class SubjectsServlet extends HttpServlet {
	protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException ,java.io.IOException {
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Subjects </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> SUBJECTS </h1>");
		out.println("<label> <input type=\"radio\" name=\"option\" value=\"c\" /> C </label> ");
		out.println("<label> <input type=\"radio\" name=\"option\" value=\"cpp\" /> Cpp </label> ");
		out.println("<label> <input type=\"radio\" name=\"option\" value=\"java\" /> JAVA </label> ");
		out.println("<label> <input type=\"radio\" name=\"option\" value=\"os\" /> OS </label> ");
//		out.println("</form>");
//		out.println("</body>");
//		out.println("</html>");
		
		
//		out.println("<html>");
//		out.println("<head>");
		out.println("<title>Book List</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>List of All Books</h1>");
		out.println("<table border='1'>");
		out.println("<thead>");
		out.printf("<th>Id</th>");
		out.printf("<th>Name</th>");
		out.printf("<th>Author</th>");
		out.printf("<th>Subject</th>");
		out.printf("<th>Price</th>");
		out.println("</thead>");
		
		try(BookDao bookDao = new BookDao()) {
		List<Book> list = bookDao.findAll();
		for (Book b : list) {
			out.println("<tr>");
			out.printf("<td>%d</td>", b.getId());
			out.printf("<td>%s</td>", b.getName());
			out.printf("<td>%s</td>", b.getAuthor());
			out.printf("<td>%s</td>", b.getSubject());
			out.printf("<td>%f</td>", b.getPrice());
			out.println("</tr>");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");	
		
	
		
	}

}

//W2_87323_Dhanashri>select * from books;
//+----+---------------------------+--------------+---------+-------+
//| id | name                      | author       | subject | price |
//+----+---------------------------+--------------+---------+-------+
//| 11 | EXPLORING C               | KANETKAR     | C       | 123.4 |
//| 12 | POINTERS IN C             | KANETKAR     | C       |   370 |
//| 13 | ANSI C PROGRAMMING        | BALGURUSWAMI | C       |   330 |
//| 14 | ANSI C PROGRAMMING        | RITCHIE      | C       |   140 |
//| 21 | C++ COMPLETE REFERENCE    | SCHILDT      | CPP     |   410 |
//| 22 | C++ PRIMER                | LIPPMAN      | CPP     |   620 |
//| 23 | C++ PROGRAMMING LANGUAGE  | STROUSTRUP   | CPP     |   540 |
//| 31 | JAVA COMPLETE REFERENCE   | SCHILDT      | JAVA    |   520 |
//| 32 | CORE JAVA VOLUME I        | HOARSMAN     | JAVA    |   575 |
//| 33 | JAVA PROGRAMMING LANGUAGE | JAMES        | JAVA    |   450 |
//| 41 | OPERATING SYSTEM CONCEPTS | GALVIN       | OS      | 567.3 |
//| 42 | DESIGN OF UNIX OS         | BACH         | OS      |   421 |
//| 43 | UNIX INTERNALS            | VAHALIA      | OS      |   352 |
//+----+---------------------------+--------------+---------+-------+


//Create a SubjectsServlets that displays all subjects as radio buttons in a HTML form.


//PrintWriter out = resp.getWriter();
//out.println("<html>");
//out.println("<head>");
//out.println("<title>Book List</title>");
//out.println("</head>");
//out.println("<body>");
//out.println("<h1>List of All Books</h1>");
//out.println("<table border='1'>");
//out.println("<thead>");
//out.printf("<th>Id</th>");
//out.printf("<th>Name</th>");
//out.printf("<th>Author</th>");
//out.printf("<th>Subject</th>");
//out.printf("<th>Price</th>");
//out.println("</thead>");
//try(BookDao bookDao = new BookDao()) {
//	List<Book> list = bookDao.findAll();
//	for (Book b : list) {
//		out.println("<tr>");
//		out.printf("<td>%d</td>", b.getId());
//		out.printf("<td>%s</td>", b.getName());
//		out.printf("<td>%s</td>", b.getAuthor());
//		out.printf("<td>%s</td>", b.getSubject());
//		out.printf("<td>%f</td>", b.getPrice());
//		out.println("</tr>");
//	}
//} catch (Exception e) {
//	e.printStackTrace();
//}