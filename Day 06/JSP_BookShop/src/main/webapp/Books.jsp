<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books Page</title>
</head>
<body>

	<h2>Books</h2>

	<jsp:useBean id="bookObj" class="com.dhanashri.beans.BooksBean" />
	<jsp:setProperty name="bookObj" property="*" />
	${bookObj.findBooks()}

	<form action="addcart.jsp" method="post">
		<table border='1'>
			<thead>
				<tr>
					<th>SELECT</th>
					<th>BOOK ID</th>
					<th>BOOK NAME</th>
					<th>BOOK AUTHOR</th>
				</tr>
			</thead>
			<c:forEach var="i" items="${bookObj.books}">
				<tr>
					<td><input type="checkbox" name="book" value="${i.id}" /></td>
					<td>${i.id}</td>
					<td>${i.name}</td>
					<td>${i.author}</td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" value="Add Cart" />
	</form>


</body>
</html>


