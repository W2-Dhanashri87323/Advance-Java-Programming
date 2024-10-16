<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books Page</title>
</head>
<body>

<h2>Books</h2>

<jsp:useBean id="bookObj" class = "com.dhanashri.beans.BooksBean"/>
<jsp:setProperty name="bookObj" property= "*" />
${bookObj.findBooks()}

<form action="addcart.jsp" method="post">
<c:forEach var ="i" item="${bookObj.books}">
<input type ="checkbox" name="book">
</c:forEach>

</form>



</body>
</html>