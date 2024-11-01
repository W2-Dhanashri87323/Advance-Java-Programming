<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout</title>
</head>
<body>
	<h2>Logged Out Successfully !!</h2>
	<% session.invalidate(); %>
	<p>
	Thank you for using our online bookstore.
	</p>
	<p>
		<a href="login1.jsp">Login Again</a>
	</p>

</body>
</html>